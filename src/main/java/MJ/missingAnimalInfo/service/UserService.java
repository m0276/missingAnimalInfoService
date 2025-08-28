package MJ.missingAnimalInfo.service;

import MJ.missingAnimalInfo.dto.UserDto;
import MJ.missingAnimalInfo.dto.request.UserCreateRequest;
import MJ.missingAnimalInfo.dto.request.UserUpdateRequest;
import MJ.missingAnimalInfo.entity.User;
import MJ.missingAnimalInfo.mapper.UserMapper;
import MJ.missingAnimalInfo.repository.UserRepo;
import java.util.NoSuchElementException;
import java.util.UUID;

import MJ.missingAnimalInfo.util.LoginUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepo userRepo;
  private final UserMapper userMapper;

  @Transactional
  public UserDto saveUser(UserCreateRequest userCreateRequest){
    User user = userRepo.save(User.builder()
        .username(userCreateRequest.username())
        .password(userCreateRequest.password())
        .build());

    return userMapper.toDto(user);
  }


  @Transactional
  public void deleteUser(){
    try{
      userRepo.deleteById(findUserId());
    } catch (Exception e){
      throw new NoSuchElementException("해당하는 사용자가 없습니다.");
    }
  }

  public UserDto getUserInfo(){
    String username = LoginUtil.getCurrentUser();
    return userMapper.toDto(userRepo.findByUsername(username)
            .orElseThrow(NoSuchElementException::new));
  }

  @Transactional
  public UserDto updateUser(UserUpdateRequest updateRequest){
    User user = userRepo.findById(findUserId()).orElseThrow(NoSuchElementException::new);
    if(updateRequest.getUsername() != null) user.setUsername(updateRequest.getUsername());
    if(updateRequest.getPassword() != null) user.setPassword(updateRequest.getPassword());

    return userMapper.toDto(user);
  }

  public UUID findUserId(){
      return userRepo.findByUsername(LoginUtil.getCurrentUser())
              .orElseThrow(NoSuchElementException::new).getId();
  }

}
