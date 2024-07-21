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
  private Integer Usernum;
  private String Name;
  private String UserID;
  private String UserPassword;
  private String UserEmail;

  public static UserDTO toUserDTO(UserEntity userEntity){
    UserDTO userDTO = new UserDTO();
    userDTO.setUsernum(userEntity.getUsernum());
    userDTO.setName(userEntity.getName());
    userDTO.setUserID(userEntity.getUserID());
    userDTO.setUserPassword(userEntity.getUserPassword());
    userDTO.setUserEmail(userEntity.getUserEmail());

    return userDTO;
  }
}
