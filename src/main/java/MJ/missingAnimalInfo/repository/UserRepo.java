package MJ.missingAnimalInfo.repository;

import MJ.missingAnimalInfo.entity.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

}
