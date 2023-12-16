package lk.ijse.orm.dao.custom;

import lk.ijse.orm.entity.User;
import lk.ijse.orm.dao.CrudDAO;

import java.util.List;

public interface UserDAO extends CrudDAO<User,String> {
    List<User> getUserDetails(String userName, String pwd) throws Exception;
}
