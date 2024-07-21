package repsac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
import repsac.demo.dto.UserDTO;
import repsac.demo.service.UserService;

@Controller
@Slf4j
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/user/save")
  public String saveForm() {
    return "save";
  }

  @PostMapping("/user/save")
  public String save(@ModelAttribute UserDTO userDTO) {
    log.info("User.save");
    log.info("userDTO = {}", userDTO);
    userService.save(userDTO);
    return "index";
  }
}
