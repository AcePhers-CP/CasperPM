package repsac.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import repsac.demo.dto.UserDTO;
import repsac.demo.service.UserService;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
  private final UserService userService;

  @GetMapping("/user/save")
  public String saveForm(){
    return "save";
  }

    @PostMapping("/user/save")
    public String save(@RequestParam("Name") String Name,
                       @RequestParam("UserID") String UserID,
                       @RequestParam("UserPassword") String UserPassword,
                       @RequestParam("UserEmail") String UserEmail) {
        log.info("user.save");
        log.info(Name + UserID + UserPassword + UserEmail);

        return "index";
    }
}
