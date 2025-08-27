package MJ.missingAnimalInfo.repository;

import MJ.missingAnimalInfo.entity.Fav;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavRepo extends JpaRepository<Fav, UUID> {

}
