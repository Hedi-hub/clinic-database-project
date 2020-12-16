package clinicDatabase.initialData;

import clinicDatabase.models.Patient;
import clinicDatabase.services.PatientService;
import org.apache.catalina.StoreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    PatientService patientService;

    @PostConstruct
    public void initializedInfo(){
        Patient patient1 = new Patient("Tom", "Doe", "tom@gmail.com", "Germany");
        Patient patient2 = new Patient("Anna", "Karnina", "anna@gmail.com", "Russia");

        patientService.savePatient(patient1);
        patientService.savePatient(patient2);

    }
}
