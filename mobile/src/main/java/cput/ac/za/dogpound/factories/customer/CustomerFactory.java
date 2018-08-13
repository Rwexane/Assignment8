package cput.ac.za.dogpound.factories.customer;

import cput.ac.za.dogpound.domain.Customer;

public class CustomerFactory {
    //singleton
    private static CustomerFactory instance=null;

    public CustomerFactory(){}

    public static CustomerFactory getInstance(){
        if (instance == null) {
            instance = new CustomerFactory();
        }
        return instance;
    }

    public static Customer createCustomer(Long id, String name,
                                          String surname)
    {
        return new Customer.Builder()
                .id(id)
                .custName(name)
                .custSurname(surname)
                .build();
    }

}
