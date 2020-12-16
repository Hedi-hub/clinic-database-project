package clinicDatabase.controllers;

import clinicDatabase.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PatientFormController {

        @Autowired
        PatientService patientService;

        @RequestMapping("/showPatientForm")
        public String showClinicForm(){
            //in return it should be called the exact name of the class ex: about us
            return "clinic-form";
        }

        @RequestMapping("/acceptPatientForm")
    public String acceptPatientRequest(@RequestParam("first-name") String firstName,
                                       @RequestParam("last-name") String lastName,
                                       @RequestParam("email") String email,
                                       @RequestParam("country") String country,
                                       @RequestParam("diagnosis") String diagnosis){
            //check if already exists?
            //if no-add and then show the options
            //if yes- show them the treatment options
            //* show treatment options on a new pag


        }

}
