package com.example.modulemavenspring.service;

import com.example.modulemavenspring.entities.Reservation;
import com.example.modulemavenspring.entities.Vehicule;
import com.example.modulemavenspring.repository.IVehiculeRepository;
import com.example.modulemavenspring.repository.Ireservationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

        // Simuler les places bientôt disponibles (vous pouvez personnaliser cette logique)
        List<Integer> soonAvailableSeats = reservedSeats.stream()
                .filter(seat -> isSoonAvailable(seat)) // Remplacez cette méthode par une logique adaptée
                .toList();

        // Préparer le résultat
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("availableSeats", availableSeats);
        result.put("soonAvailableSeats", soonAvailableSeats);

        return result;
    }

    // Exemple de logique pour déterminer si une place sera bientôt disponible
    private boolean isSoonAvailable(Integer seatNumber) {
        // Vous pouvez ajouter ici une logique, comme vérifier une réservation qui se termine bientôt
        return true; // Exemple simplifié
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
