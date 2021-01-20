package clinicDatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {

    @RequestMapping("/contact")

    public String showContactUsPage(){

        return "contact-us";
    }
}
