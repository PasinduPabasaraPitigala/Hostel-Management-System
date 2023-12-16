package lk.ijse.orm.bo.custom.impl;


import lk.ijse.orm.bo.SuperBO;
import lk.ijse.orm.bo.custom.PendingKeyMoneyBO;
import lk.ijse.orm.dao.DAOFactory;
import lk.ijse.orm.dao.custom.QueryDAO;
import lk.ijse.orm.dao.custom.RegistrationDAO;
import lk.ijse.orm.dto.CustomDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PendingKeyMoneyBOImpl implements PendingKeyMoneyBO, SuperBO {
    private final RegistrationDAO registrationDAO= (RegistrationDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.REGISTRATION);
    private final QueryDAO queryDAO= (QueryDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.QUERYDAO);
    @Override
    public List<CustomDTO> getAllPendingKeyMoneyReservationsUsingReservationStatus() throws Exception {
        List<Object[]> objects = queryDAO.getAllPendingKeyMoneyReservationsUsingReservationStatus();
        ArrayList<CustomDTO> arrayList = new ArrayList<>();

        for (Object[] o:objects
             ) {
            arrayList.add(new CustomDTO((String) o[0],(String) o[1],(String) o[2],(String) o[3],(String) o[4],(double) o[5],(String) o[6],(LocalDate) o[7]));
        }

        return arrayList;


    }

    @Override
    public boolean updateReservationUsingId(String id, String status) throws Exception {
        return registrationDAO.updateUsingId(id,status);
    }
}
