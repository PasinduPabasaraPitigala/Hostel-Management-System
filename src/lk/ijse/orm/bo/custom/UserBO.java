package lk.ijse.orm.bo.custom;

import lk.ijse.orm.dto.UserDTO;
import lk.ijse.orm.bo.SuperBO;

import java.io.IOException;
import java.util.List;

public interface UserBO extends SuperBO {
    boolean saveUser(UserDTO dto) throws Exception;

    boolean updateUser(UserDTO dto) throws Exception;

    boolean deleteUser(String id) throws Exception;

    String generateUserId()throws Exception;

    List<UserDTO> getAllUsers() throws IOException;
}
