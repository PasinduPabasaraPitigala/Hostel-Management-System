package lk.ijse.orm.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.orm.bo.BOFactory;
import lk.ijse.orm.bo.custom.LogBO;
import lk.ijse.orm.dto.UserDTO;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class LoginFormController {
    public JFXTextField txtUserName;
    public JFXPasswordField txtPassword;
    public Label lblWrong;
    public AnchorPane loginFormContext;
    private final LogBO logBO = (LogBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.LOG);

    public void btnLoginOnAction(ActionEvent actionEvent) throws Exception {
        if(txtUserName.getText().equals("000") && txtPassword.getText().equals("000")){
            /*lblWrong.setText("Please enter your UserName and Password");*/
            setUI("DashBoardForm");
        }else if (txtUserName.getText()!=null&& txtPassword.getText()!=null){
            List<UserDTO>userDetails=logBO.getUserDetails(txtUserName.getText(),txtPassword.getText());
            UserDTO userDTO = new UserDTO();
            for (UserDTO u:userDetails
                 ) {
                userDTO.setUserName(u.getUserName());
                userDTO.setPassword(u.getPassword());
            }

            if (txtUserName.getText().equals(userDTO.getUserName()) &&  txtPassword.getText().equals(userDTO.getPassword())){
                /*setUI("DashBoardForm");*/
            }else {
                new Alert(Alert.AlertType.WARNING,"Wrong UserName OR Password, Try Again!").show();
            }

        }else {
            new Alert(Alert.AlertType.WARNING,"Try Again !").show();
        }
    }

    private void setUI(String URI) throws IOException {

        Stage stage1= (Stage)loginFormContext.getScene().getWindow();
        stage1.close();
        URL resource = getClass().getResource("/lk/ijse/orm/view/" +URI+".fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage2= new Stage();
        stage2.setTitle("Hostel Management System");

        stage2.setScene(scene);
        stage2.centerOnScreen();
        stage2.show();
    }
}
