package MJ.missingAnimalInfo.entity;

import MJ.missingAnimalInfo.config.Role;
import jakarta.persistence.*;

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
  @Id @Builder.Default
  UUID id = UUID.randomUUID();

  String username;

  String password;

  @Column @Enumerated(EnumType.STRING)
  Role role;

  public void setUsername(String username){
    this.username = username;
  }

  public void setPassword(String password){
    this.password = password;
  }
}
