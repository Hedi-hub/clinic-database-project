package clinicDatabase.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String specialty;
    private String clinicName;

    public Doctor(){}
    /*No Id in our constructor*/
    public Doctor(String name, String specialty,  String clinicName) {
        this.name = name;
        this.specialty = specialty;
        this.clinicName = clinicName;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
