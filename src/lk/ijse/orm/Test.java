package lk.ijse.orm;

import lk.ijse.orm.util.FactoryConfiguration;
import org.hibernate.Session;

public class Test {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

    }
}
