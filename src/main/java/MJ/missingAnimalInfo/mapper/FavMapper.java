package MJ.missingAnimalInfo.mapper;

import MJ.missingAnimalInfo.dto.FavDto;
import MJ.missingAnimalInfo.entity.Fav;
import java.util.List;

@Mapper
public interface FavMapper {
  FavDto toDto(Fav fav);

  List<FavDto> toDtoLists(List<Fav> favList);
}
