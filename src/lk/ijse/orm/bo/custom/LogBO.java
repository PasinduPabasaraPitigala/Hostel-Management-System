package lk.ijse.orm.bo.custom;


import lk.ijse.orm.dto.UserDTO;
import lk.ijse.orm.bo.SuperBO;

import java.util.List;

public interface LogBO extends SuperBO {
    List<UserDTO> getUserDetails(String userName, String pwd) throws Exception;
}
