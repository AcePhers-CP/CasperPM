package repsac.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import repsac.demo.dto.UserDTO;

@Entity
@Setter
@Getter
@Table(name = "User")
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer userNum;

  @Column
  private String name;

  @Column(unique = true)
  private String userID;

  @Column
  private String userPassword;

  @Column(unique = true)
  private String userEmail;

  public static UserEntity toUserEntity(UserDTO userDTO){
    UserEntity userEntity = new UserEntity();
    userEntity.setUserNum(userDTO.getUserNum());
    userEntity.setName(userDTO.getName());
    userEntity.setUserID(userDTO.getUserID());
    userEntity.setUserPassword(userDTO.getUserPassword());
    userEntity.setUserEmail(userDTO.getUserEmail());
    return userEntity;

}

}
