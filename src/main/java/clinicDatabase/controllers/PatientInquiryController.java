package clinicDatabase.controllers;

import clinicDatabase.models.PatientContactInquiry;
import clinicDatabase.services.PatientContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PatientInquiryController {

    @Autowired
    PatientContactService patientContactService;

    @RequestMapping("/submitPatientInquiry")
    public String submitPatientContactForm(@RequestParam("doctor-name") String doctorName,
                                           @RequestParam("user-number") String contactNumber){

        PatientContactInquiry patientContactInquiry = new PatientContactInquiry(doctorName,contactNumber);
        patientContactService.savePatientInquiryContact(patientContactInquiry);

        return "doctor-inquiry";
    }

}
