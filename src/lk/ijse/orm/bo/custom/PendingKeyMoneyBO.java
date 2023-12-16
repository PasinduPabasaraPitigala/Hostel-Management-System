package lk.ijse.orm.bo.custom;


import lk.ijse.orm.dto.CustomDTO;
import lk.ijse.orm.bo.SuperBO;

import java.util.List;

public interface PendingKeyMoneyBO extends SuperBO {
    List<CustomDTO> getAllPendingKeyMoneyReservationsUsingReservationStatus() throws Exception;
    boolean updateReservationUsingId(String id, String status) throws Exception;

    }
