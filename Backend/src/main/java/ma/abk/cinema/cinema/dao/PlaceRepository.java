package ma.abk.cinema.cinema.dao;

import ma.abk.cinema.cinema.entities.Place;
import ma.abk.cinema.cinema.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestController
@CrossOrigin("*")
public interface PlaceRepository extends JpaRepository<Place,Long> {
}
