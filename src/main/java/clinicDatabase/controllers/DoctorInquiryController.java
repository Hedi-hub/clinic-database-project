package clinicDatabase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorInquiryController {

    @RequestMapping("/showDoctorInquiry")
    //WE ADD MODEL BECAUSE IT IS A MSG BOX WHICH COMMUNICATES BTW VARIOUS HTML PAGES
    public String showDoctorInquiry(@RequestParam("doctor-name") String name,
                                    Model model){

        model.addAttribute("doctorName", name);
        return "doctor-inquiry";
    }

}
