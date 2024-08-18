package repsac.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class S3Controller {

    private static final Logger log = LoggerFactory.getLogger(S3Controller.class);
    private final FileLoadController fileLoadController;
    @Autowired
    public S3Controller(FileLoadController fileLoadController) {
        this.fileLoadController = fileLoadController;
    }


    @GetMapping(value="/load")
    public String test(Model model) throws Exception {
        String url = fileLoadController.getPath("project/c3a4259bd3d165a7c2298afece387c61.jpg");
        model.addAttribute("PATH",url);
        return "S3tests";
    }
}
