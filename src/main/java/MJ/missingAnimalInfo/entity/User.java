package MJ.missingAnimalInfo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
  @Id
  UUID id = UUID.randomUUID();

  String username;

  String password;

  @Column(name = "fav_id")
  @OneToMany
  List<Fav> favList;
}
