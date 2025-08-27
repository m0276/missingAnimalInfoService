package MJ.missingAnimalInfo.service;

import MJ.missingAnimalInfo.dto.UserDto;
import MJ.missingAnimalInfo.dto.request.UserCreateRequest;
import MJ.missingAnimalInfo.dto.request.UserUpdateRequest;
import MJ.missingAnimalInfo.entity.User;
import MJ.missingAnimalInfo.mapper.UserMapper;
import MJ.missingAnimalInfo.repository.UserRepo;
import java.util.NoSuchElementException;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepo userRepo;
  private final UserMapper userMapper;

  public UserDto saveUser(UserCreateRequest userCreateRequest){
    User user = userRepo.save(User.builder()
        .username(userCreateRequest.username())
        .password(userCreateRequest.password())
        .build());

    return userMapper.toDto(user);
  }


  public void deleteUser(UUID userId){
    try{
      userRepo.deleteById(userId);
    } catch (Exception e){
      throw new NoSuchElementException("해당하는 사용자가 없습니다.");
    }
  }

  public UserDto getUserInfo(){
    // login user 받아오기
    return null;
  }

  public UserDto updateUser(UserUpdateRequest updateRequest){
    User user = userRepo.findById(/*loginuser*/UUID.randomUUID())
        .orElseThrow(NoSuchElementException::new);
    if(updateRequest.getUsername() != null) user.setUsername(updateRequest.getUsername());
    if(updateRequest.getPassword() != null) user.setPassword(updateRequest.getPassword());

    return userMapper.toDto(user);
  }

}
