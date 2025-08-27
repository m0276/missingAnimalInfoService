package MJ.missingAnimalInfo.entity;

import MJ.missingAnimalInfo.config.FavType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "fav")
public class Fav {
  @Id
  UUID id = UUID.randomUUID();

  @Column @Enumerated(value = EnumType.STRING)
  FavType type;

  String savedId;

  UUID userId;

}
