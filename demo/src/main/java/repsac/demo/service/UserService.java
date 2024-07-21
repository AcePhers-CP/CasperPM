package repsac.demo.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import repsac.demo.dto.UserDTO;
import repsac.demo.entity.UserEntity;
import repsac.demo.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;
  
  public void save(UserDTO userDTO){
    UserEntity userEntity = UserEntity.toUserEntity(userDTO);
    userRepository.save(userEntity);
  }
}
