package clinicDatabase.services;

import clinicDatabase.models.Doctor;

import java.util.ArrayList;

public class DoctorPatientMatcher {

    public ArrayList<Doctor> getDoctorByKeyword(ArrayList<Doctor> allDoctors, String userSearchTerm){
        ArrayList<Doctor> matchDoctors = new ArrayList<>();
        if (userSearchTerm.contains("surgery")
               ||userSearchTerm.contains("injury")){
            for (Doctor doctor : allDoctors){
                if (doctor.getSpecialty().contains("surgeon") || doctor.getSpecialty().contains("dentist")){
                    matchDoctors.add(doctor);
                }
            }
        }

        if (userSearchTerm.contains("oncology")
                ||userSearchTerm.contains("cancer")){
            for (Doctor doctor : allDoctors){
                if (doctor.getSpecialty().contains("oncologist")){
                    matchDoctors.add(doctor);
                }
            }
        }

        if (userSearchTerm.contains("heart")
                ||userSearchTerm.contains("cardiac")){
            for (Doctor doctor : allDoctors){
                if (doctor.getSpecialty().contains("cardialogist")){
                    matchDoctors.add(doctor);
                }
            }
        }
        return matchDoctors;
    }
}
