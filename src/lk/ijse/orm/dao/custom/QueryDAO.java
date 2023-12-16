package lk.ijse.orm.dao.custom;


import lk.ijse.orm.dao.SuperDAO;

import java.util.List;

public interface QueryDAO extends SuperDAO {
    List<Object[]> getAllPendingKeyMoneyReservationsUsingReservationStatus() throws Exception;
}
