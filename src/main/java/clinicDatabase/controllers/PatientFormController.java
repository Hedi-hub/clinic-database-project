package clinicDatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PatientFormController {

        @RequestMapping("/showPatientForm")
        public String showAboutUsPage(){
            //in return it should be called the exact name of the class ex: about us
            return "clinic-form";
        }

}
