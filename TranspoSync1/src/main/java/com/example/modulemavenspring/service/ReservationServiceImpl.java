package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Reservation;
import com.example.modulemavenspring.entities.SeatStatus;
import com.example.modulemavenspring.entities.Vehicule;
import com.example.modulemavenspring.repository.IVehiculeRepository;
import com.example.modulemavenspring.repository.Ireservationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ReservationServiceImpl implements IreservationService {
    @Autowired
    private Ireservationrepository reservationRepository;
    @Autowired
    private IVehiculeRepository vehiculeRepository;


    @Override
    public Map<Integer, SeatStatus> getSeatStatuses(Long vehiculeId) {
        // Récupérer le véhicule par son ID
        Vehicule vehicule = vehiculeRepository.findById(vehiculeId)
                .orElseThrow(() -> new RuntimeException("Véhicule introuvable"));

        // Récupérer toutes les réservations pour ce véhicule
        List<Reservation> reservations = vehicule.getReservations();

        // Obtenir le nombre total de places
        int totalSeats = vehicule.getNombrePlaces();

        // Créer un mappage pour les statuts des places
        Map<Integer, SeatStatus> seatStatuses = new HashMap<>();

        // Initialiser toutes les places comme disponibles
        for (int i = 1; i <= totalSeats; i++) {
            seatStatuses.put(i, SeatStatus.AVAILABLE);
        }

        // Mettre à jour les places réservées et bientôt disponibles
        for (Reservation reservation : reservations) {
            int seatNumber = reservation.getSeatNumber();
            seatStatuses.put(seatNumber, SeatStatus.RESERVED);

            // Vérifier si la place sera bientôt disponible
            if (isSoonAvailable(reservation)) {
                seatStatuses.put(seatNumber, SeatStatus.SOON_AVAILABLE);
            }
        }

        return seatStatuses;
    }

    // Logique pour déterminer si une place sera bientôt disponible
    private boolean isSoonAvailable(Reservation reservation) {
        if (reservation.getEndDate() != null) {
            LocalDateTime now = LocalDateTime.now();
            Duration duration = Duration.between(now, reservation.getEndDate());
            return duration.toMinutes() <= 30; // Bientôt disponible si elle se libère dans les 30 prochaines minutes
        }
        return false;
    }

    @Override
    public Map<String, List<Integer>> getAvailableSeats(Long vehiculeId, Long stationId) {
        // Récupérer le véhicule par son ID
        Vehicule vehicule = vehiculeRepository.findById(vehiculeId)
                .orElseThrow(() -> new RuntimeException("Véhicule introuvable"));

        // Vérifier si le véhicule est lié à la station donnée
        if (!vehicule.getStations().stream().anyMatch(station -> station.getIdStation().equals(stationId))) {
            throw new RuntimeException("Le véhicule n'est pas lié à cette station");
        }

        // Récupérer toutes les réservations pour ce véhicule
        List<Reservation> reservations = vehicule.getReservations();

        // Calculer toutes les places
        int totalSeats = vehicule.getNombrePlaces(); // Assurez-vous que cette méthode est correctement implémentée dans l'entité Vehicule

        // Liste de toutes les places
        List<Integer> allSeats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            allSeats.add(i);
        }

        // Places réservées
        List<Integer> reservedSeats = reservations.stream()
                .map(Reservation::getSeatNumber)
                .toList();

        // Calculer les places disponibles
        List<Integer> availableSeats = new ArrayList<>(allSeats);
        availableSeats.removeAll(reservedSeats);

        List<Integer> soonAvailableSeats = reservedSeats.stream()
                .filter(seatNumber -> {
                    // Trouver la réservation correspondant au numéro de siège
                    Reservation reservation = reservations.stream()
                            .filter(res -> res.getSeatNumber() == seatNumber)
                            .findFirst()
                            .orElse(null);

                    // Vérifier si la réservation existe et si la place est bientôt disponible
                    return reservation != null && isSoonAvailable(reservation);
                })
                .toList();


        // Préparer le résultat
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("availableSeats", availableSeats);
        result.put("soonAvailableSeats", soonAvailableSeats);

        return result;
    }


    @Override
        public Reservation addReservation(Reservation reservation) {
            return reservationRepository.save(reservation);
        }

        @Override
        public List<Reservation> retrieveAllReservations() {
            return (List<Reservation>) reservationRepository.findAll();
        }

        @Override
        public Reservation retrieveReservation(Long idR) {
            return reservationRepository.findById(idR).orElse(null);
        }

        @Override
        public void removeReservation(Long idR) {
            reservationRepository.deleteById(idR);
        }

        @Override
        public Reservation modifyReservation(Reservation reservation) {
            return reservationRepository.save(reservation);
        }

}
