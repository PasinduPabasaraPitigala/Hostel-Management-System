package lk.ijse.orm.dao.custom;

import lk.ijse.orm.entity.Room;
import lk.ijse.orm.dao.CrudDAO;

import java.util.List;

public interface RoomDAO extends CrudDAO<Room,String> {
    List<Room> getRoomDetailUsingId(String id) throws Exception;
}
