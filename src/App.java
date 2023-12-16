import javafx.stage.Stage;
import lk.ijse.orm.entity.Student;
import lk.ijse.orm.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public abstract class App {
    public static void main(String[] args) {
        Session session1= FactoryConfiguration.getInstance().getSession();
        Transaction transaction1=session1.beginTransaction();
        Student student=new Student("c001",null,null,null,null,null);

        session1.save(student);
        transaction1.commit();
        session1.close();

    }

    public abstract void start(Stage primaryStage) throws IOException;
}