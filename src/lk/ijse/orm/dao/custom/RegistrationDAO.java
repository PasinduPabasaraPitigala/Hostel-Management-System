package lk.ijse.orm.dao.custom;


import lk.ijse.orm.entity.Reservation;
import lk.ijse.orm.dao.CrudDAO;

import java.io.IOException;
import java.util.List;

public interface RegistrationDAO extends CrudDAO<Reservation,String> {
    boolean save(Reservation reservation) throws Exception;

    boolean update(Reservation reservation) throws Exception;

    boolean delete(String s) throws Exception;

    List<Reservation> getAll() throws IOException;

    String generateId() throws Exception;

    boolean updateUsingId(String id, String status) throws Exception;
}
