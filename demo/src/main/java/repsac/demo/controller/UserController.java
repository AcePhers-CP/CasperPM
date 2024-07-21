package repsac.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserController {
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
