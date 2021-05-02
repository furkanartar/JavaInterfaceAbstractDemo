package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        if (!customer.getNationalityId().isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
