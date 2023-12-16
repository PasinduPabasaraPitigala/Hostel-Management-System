package lk.ijse.orm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class CustomDTO {
    private String res_id;
    private String student_id;
    private String name;
    private String room_type_id;
    private String type;
    private double key_money;
    private String status;
    private LocalDate date;

    public CustomDTO() {
    }

    public CustomDTO(String res_id, String student_id, String name, String room_type_id, String type, double key_money, String status, LocalDate date) {
        this.res_id = res_id;
        this.student_id = student_id;
        this.name = name;
        this.room_type_id = room_type_id;
        this.type = type;
        this.key_money = key_money;
        this.status = status;
        this.date = date;
    }

    public String getRes_id() {
        return res_id;
    }

    public void setRes_id(String res_id) {
        this.res_id = res_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(String room_type_id) {
        this.room_type_id = room_type_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getKey_money() {
        return key_money;
    }

    public void setKey_money(double key_money) {
        this.key_money = key_money;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
