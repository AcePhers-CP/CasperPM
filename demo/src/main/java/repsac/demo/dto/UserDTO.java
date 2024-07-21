package repsac.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import repsac.demo.entity.UserEntity;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO {
  private Integer userNum;
  private String name;
  private String userID;
  private String userPassword;
  private String userEmail;

  public static UserDTO toUserDTO(UserEntity userEntity){
    UserDTO userDTO = new UserDTO();
    userDTO.setUserNum(userEntity.getUserNum());
    userDTO.setName(userEntity.getName());
    userDTO.setUserID(userEntity.getUserID());
    userDTO.setUserPassword(userEntity.getUserPassword());
    userDTO.setUserEmail(userEntity.getUserEmail());

    return userDTO;
}
}