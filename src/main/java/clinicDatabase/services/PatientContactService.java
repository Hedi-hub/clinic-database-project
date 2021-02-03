package clinicDatabase.services;

import clinicDatabase.models.PatientContactInquiry;
import clinicDatabase.repositories.PatientContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientContactService {

    @Autowired
    private PatientContactRepository patientContactRepository;

    public void savePatientInquiryContact(PatientContactInquiry patientContactInquiry){
        patientContactRepository.save(patientContactInquiry);
    }

    public void removePatientInquiryContact(PatientContactInquiry patientContactInquiry){
        patientContactRepository.delete(patientContactInquiry);
    }

    public List<PatientContactInquiry> getAllContactInquiries(){
        return(List<PatientContactInquiry>) patientContactRepository.findAll();

    }
}
