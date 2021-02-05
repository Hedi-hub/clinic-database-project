package clinicDatabase.controllers;

import clinicDatabase.models.PatientContactInquiry;
import clinicDatabase.services.PatientContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PatientInquiryController {

    @Autowired
    PatientContactService patientContactService;

    @RequestMapping("/submitPatientInquiry")
    public String submitPatientContactForm(@RequestParam("doctor-name") String doctorName,
                                           @RequestParam("user-number") String contactNumber,
                                           Model model){

        PatientContactInquiry patientContactInquiry = new PatientContactInquiry(doctorName,contactNumber);
        patientContactService.savePatientInquiryContact(patientContactInquiry);

        model.addAttribute("message", "Thank you! Dr. " + doctorName+
                " will contact you soon!");
        model.addAttribute("condition", false);
        return "doctor-inquiry";
    }

}
