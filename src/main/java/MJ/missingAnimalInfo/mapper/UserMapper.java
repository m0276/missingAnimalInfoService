package MJ.missingAnimalInfo.mapper;

import MJ.missingAnimalInfo.dto.UserDto;
import MJ.missingAnimalInfo.entity.User;
import java.util.List;

@Mapper
public interface UserMapper {

  UserDto toDto(User user);

  List<UserDto> toDtoList(List<User> userList);
}
