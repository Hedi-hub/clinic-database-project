package clinicDatabase.controllers;

import clinicDatabase.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

    @Autowired
    EmailService emailService;

    @RequestMapping("/sendMessage")

    public String acceptMessage(@RequestParam("userName")String userName,
                                @RequestParam ("userEmail")String email,
                                @RequestParam ("userMessage")String message){

        emailService.sendSimpleMessage(email, "FROM PLANNER WEBSITE", message);
        return "index";
    }
}
