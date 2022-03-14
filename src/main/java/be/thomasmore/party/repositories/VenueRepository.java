package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Venue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface VenueRepository extends CrudRepository<Venue, Integer> {
    Iterable<Venue> findByOutdoor(boolean isOutdoor);
    Iterable<Venue> findByIndoor(boolean isIndoor);
    Iterable<Venue> findByCapacityLessThanEqual(Integer capacity);
    Iterable<Venue> findByCapacityIsBetween(int min, int max);

    Optional<Venue> findFirstByIdLessThanOrderByIdDesc(int id);
    Optional<Venue> findFirstByIdGreaterThanOrderById(int id);
    Optional<Venue> findFirstByOrderByIdDesc();
    Optional<Venue> findFirstByOrderByIdAsc();

    Iterable<Venue> findByCapacityIsGreaterThanEqual(Integer capacity);





        @Query("SELECT v FROM Venue v WHERE (:min IS NULL OR v.capacity >= :min) AND (:max IS NULL OR v.capacity <= :max) AND (:distance IS NULL  OR v.distanceFromPublicTransportInKm <= :distance ) ")
        List<Venue> findVenues(@Param("min") Integer min, @Param("max") Integer max, @Param("distance") Double distance);



}
