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

        Doctor doctor1 = new Doctor("Paul Ekman", "Dentist", "SmileStudio");
        Doctor doctor2 = new Doctor("Hedieh Shafaee", "Surgery", "Charite");
        Doctor doctor3 = new Doctor("Tom Hanks", "oncologist", "MeoKlinik");
        Doctor doctor4 = new Doctor("Anna Karnina", "Cardiologist", "Charite");
        Doctor doctor5 = new Doctor("Peter Wein", "Dentist", "SmileStudio");

        doctorService.saveDoctor(doctor1);
        doctorService.saveDoctor(doctor2);
        doctorService.saveDoctor(doctor3);
        doctorService.saveDoctor(doctor4);
        doctorService.saveDoctor(doctor5);


    }

}
