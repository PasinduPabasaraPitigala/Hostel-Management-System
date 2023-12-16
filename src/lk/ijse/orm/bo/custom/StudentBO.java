package lk.ijse.orm.bo.custom;

import lk.ijse.orm.dto.StudentDTO;
import lk.ijse.orm.bo.SuperBO;

import java.io.IOException;
import java.util.List;

public interface StudentBO extends SuperBO {
    boolean saveStudent(StudentDTO dto) throws Exception;

    boolean updateStudent(StudentDTO dto) throws Exception;

    boolean deleteStudent(String id) throws Exception;

    String generateStudentId()throws Exception;

    List<StudentDTO> getAllStudents() throws IOException;
}
