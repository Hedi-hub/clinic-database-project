package clinicDatabase.repositories;

import clinicDatabase.models.PatientContactInquiry;
import org.springframework.data.repository.CrudRepository;

public interface PatientContactRepository extends CrudRepository<PatientContactInquiry, Long> {
}
