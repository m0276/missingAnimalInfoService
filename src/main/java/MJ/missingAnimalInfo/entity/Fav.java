package MJ.missingAnimalInfo.entity;

import MJ.missingAnimalInfo.config.FavType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@Table(name = "fav")
@NoArgsConstructor
@AllArgsConstructor
public class Fav {
  @Id @Builder.Default
  UUID id = UUID.randomUUID();

  @Column @Enumerated(value = EnumType.STRING)
  FavType type;

  String savedId;

  @Column(name = "user_id")
  UUID userId;

}
