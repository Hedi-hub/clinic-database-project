package clinicDatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class HomePageController {

   @RequestMapping(value = {"/", "/index", "/home" })
   //request comes before the method!

    public String showHomePage(){
        return "index";
    }

}
