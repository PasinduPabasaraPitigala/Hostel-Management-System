package lk.ijse.orm.bo.custom;


import lk.ijse.orm.dto.RoomDTO;
import lk.ijse.orm.bo.SuperBO;

import java.io.IOException;
import java.util.List;

public interface RoomBO extends SuperBO {
    boolean saveRoom(RoomDTO dto) throws Exception;

    boolean updateRoom(RoomDTO dto) throws Exception;

    boolean deleteRoom(String id) throws Exception;

    List<RoomDTO> getAllRooms() throws IOException;
}
