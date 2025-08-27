package MJ.missingAnimalInfo.dto;


import MJ.missingAnimalInfo.config.FavType;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavDto {
  UUID id;
  UUID savedId;
  FavType favType;
  UUID userId;
}
