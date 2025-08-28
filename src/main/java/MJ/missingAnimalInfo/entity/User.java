package MJ.missingAnimalInfo.entity;

import MJ.missingAnimalInfo.config.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
  @Id
  UUID id = UUID.randomUUID();

  String username;

  String password;

  @Column(name = "fav_id")
  @OneToMany
  List<Fav> favList;

  List<Role> roles;

  public void setUsername(String username){
    this.username = username;
  }

  public void setPassword(String password){
    this.password = password;
  }
}
