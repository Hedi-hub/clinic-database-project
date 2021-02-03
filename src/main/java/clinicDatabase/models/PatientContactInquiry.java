package clinicDatabase.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class PatientContactInquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String doctorName;
    private String contactNumber;

    public PatientContactInquiry(){}

    public PatientContactInquiry(String doctorName, String contactNumber) {
        this.doctorName = doctorName;
        this.contactNumber = contactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "PatientContactInquiry{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientContactInquiry that = (PatientContactInquiry) o;
        return id == that.id && Objects.equals(doctorName, that.doctorName) && Objects.equals(contactNumber, that.contactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, doctorName, contactNumber);
    }
}
