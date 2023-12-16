package lk.ijse.orm.dao.custom;

import lk.ijse.orm.entity.Student;
import lk.ijse.orm.dao.CrudDAO;

import java.util.List;

public interface StudentDAO extends CrudDAO<Student,String> {
    List<Student> getStudentDetailsUsingId(String id) throws Exception;
}
