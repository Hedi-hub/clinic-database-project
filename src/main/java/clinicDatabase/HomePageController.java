package clinicDatabase;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class HomePageController {

   @RequestMapping(value = {"/", "/index", "/home" })
    public String showHomePage(){
        return "index";
    }

}
