//package cput.ac.za.dogpound.dogpound.services.customer;
//
//import android.test.AndroidTestCase;
//
//import cput.ac.za.dogpound.conf.App;
//import cput.ac.za.dogpound.domain.Customer;
//import cput.ac.za.dogpound.services.customer.Impl.CustomerServiceImpl;
//public class CustomerServiceTest extends AndroidTestCase {
//    private CustomerServiceImpl customerService;
//
//    public void testSaveCustomer() throws Exception {
//
//        Customer cust = new Customer.Builder()
//                .id(Long.parseLong("#24324"))
//                .name("Bulelani")
//                .surname("Rwexane")
//                .build();
//        customerService = new CustomerServiceImpl();
//        customerService.addCustomer(App.getAppContext());
//        customerService.saveCustomer(cust);
//        System.out.print("Address Saved!!");
//    }
//}
