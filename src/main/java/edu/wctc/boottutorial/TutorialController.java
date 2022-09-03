package edu.wctc.boottutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TutorialController {
    @RequestMapping("/")
    public String getHomePage(){
        return "/index";
    }

    @RequestMapping("/step-one")
    public String getStepOnePage(){
        return "/pages/step-one";
    }

    @RequestMapping("/step-two")
    public String getStepTwoPage(){
        return "/pages/step-two";
    }

    @RequestMapping("/step-three")
    public String getStepThreePage(){
        return "/pages/step-three";
    }
}
