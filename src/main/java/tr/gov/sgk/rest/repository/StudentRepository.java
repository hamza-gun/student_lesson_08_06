package tr.gov.sgk.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.gov.sgk.rest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer > {
}
