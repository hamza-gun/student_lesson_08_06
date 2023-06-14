package tr.gov.sgk.rest.service;

import tr.gov.sgk.rest.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();

    Optional<Student> getStudentById(int id);

    Student createStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(int id);
}
