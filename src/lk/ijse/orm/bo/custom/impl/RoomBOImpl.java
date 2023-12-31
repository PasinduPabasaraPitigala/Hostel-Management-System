package lk.ijse.orm.bo.custom.impl;


import lk.ijse.orm.bo.SuperBO;
import lk.ijse.orm.bo.custom.RoomBO;
import lk.ijse.orm.dao.DAOFactory;
import lk.ijse.orm.dao.custom.RoomDAO;
import lk.ijse.orm.dto.RoomDTO;
import lk.ijse.orm.entity.Room;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomBOImpl implements RoomBO, SuperBO {
    private final RoomDAO roomDAO = (RoomDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ROOM);

    @Override
    public boolean saveRoom(RoomDTO dto) throws Exception {
        return roomDAO.save(new Room(dto.getRoom_type_id(),dto.getType(),dto.getKey_money(),dto.getQty()));
    }

    @Override
    public boolean updateRoom(RoomDTO dto) throws Exception {
        return roomDAO.update(new Room(dto.getRoom_type_id(),dto.getType(),dto.getKey_money(),dto.getQty()));
    }

    @Override
    public boolean deleteRoom(String id) throws Exception {
        return roomDAO.delete(id);
    }

    @Override
    public List<RoomDTO> getAllRooms() throws IOException {

        List<Room> all = roomDAO.getAll();
        List<RoomDTO> roomDTOS = new ArrayList<>();
        for (Room room:all
             ) {
            roomDTOS.add(
                    new RoomDTO(room.getRoom_type_id(),room.getType(),room.getKey_money(),room.getQty())
            );
        }
        return roomDTOS;
    }
}
