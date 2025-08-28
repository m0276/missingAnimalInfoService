package MJ.missingAnimalInfo.dto.request;

import MJ.missingAnimalInfo.config.FavType;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavRequest {
    String savedId;
  FavType type;
}
