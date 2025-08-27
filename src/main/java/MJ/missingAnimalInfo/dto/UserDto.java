package MJ.missingAnimalInfo.dto;

import MJ.missingAnimalInfo.entity.Fav;
import java.util.List;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
  UUID id;
  String username;

  String password;

  List<FavDto> favList;
}
