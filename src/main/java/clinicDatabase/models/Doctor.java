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
    private ArrayList<String> specialty;

    public Doctor(){}
    /*No Id in our constructor*/
    public Doctor(String name) {
        this.name = name;
        this.specialty = new ArrayList<>();
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSpecialty() {
        return specialty;
    }

    public void setSpecialty(ArrayList<String> specialty) {
        this.specialty = specialty;
    }
}
