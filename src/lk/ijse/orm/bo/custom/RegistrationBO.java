package lk.ijse.orm.bo.custom;

import javafx.collections.ObservableList;
import lk.ijse.orm.dto.RoomDTO;
import lk.ijse.orm.dto.StudentDTO;
import lk.ijse.orm.view.tm.CartTM;
import lk.ijse.orm.bo.SuperBO;

import java.io.IOException;
import java.util.List;

public interface RegistrationBO extends SuperBO {

    void Register(ObservableList<CartTM> list, String studentId, String lblId) throws Exception;

    List<StudentDTO> getAllStudents() throws IOException;
    List<RoomDTO> getAllRooms() throws IOException;
    List<RoomDTO> getRoomDetailUsingId(String id) throws Exception;
    List<StudentDTO> getStudentDetailUsingId(String id) throws Exception;
    String generateRegistrationId()throws Exception;

}
