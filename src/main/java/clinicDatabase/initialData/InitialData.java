package clinicDatabase.initialData;

import clinicDatabase.models.Doctor;
import clinicDatabase.models.Patient;
import clinicDatabase.services.DoctorService;
import clinicDatabase.services.PatientService;
import org.apache.catalina.StoreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class InitialData {

    @Autowired
    PatientService patientService;

    @Autowired
    DoctorService doctorService;

    @PostConstruct
    public void initializedInfo(){
        Patient patient1 = new Patient("Tom", "Doe", "tom@gmail.com", "Germany");
        Patient patient2 = new Patient("Anna", "Karnina", "anna@gmail.com", "Russia");

        patientService.savePatient(patient1);
        patientService.savePatient(patient2);

        Doctor doctor1 = new Doctor("Paul Ekman", "Dentist", "MedSup");
        Doctor doctor2 = new Doctor("Hedieh Shafaee", "Surgery", "Clinic#1");

        doctorService.saveDoctor(doctor1);
        doctorService.saveDoctor(doctor2);


    }

}
