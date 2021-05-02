import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Date;


public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(1, "Ad", "Soyisim", new Date(1999-9-19), "12345678910"));
    }
}
