package MJ.missingAnimalInfo.repository;

import MJ.missingAnimalInfo.entity.Fav;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavRepo extends JpaRepository<Fav, UUID> {

  Optional<Fav> findBySavedIdAndUserId(String savedId, UUID userId);

  void deleteByUserIdAndSavedId(UUID userId, String savedId);

  List<Fav> getFavsByUserId(UUID userId);
}
