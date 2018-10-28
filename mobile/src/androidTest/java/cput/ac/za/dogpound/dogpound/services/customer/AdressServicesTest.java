//package cput.ac.za.dogpound.dogpound.services.customer;
//
//import android.test.AndroidTestCase;
//
//import cput.ac.za.dogpound.conf.App;
//import cput.ac.za.dogpound.domain.Address;
//import cput.ac.za.dogpound.services.customer.Impl.AddressServiceImpl;
//
//public class AdressServicesTest extends AndroidTestCase {
//
//    private AddressServiceImpl addressService;
//
//    public void testSaveAddress() throws Exception {
//
//        Address address = new Address.Builder()
//                .room("287")
//                .street("Watergang")
//                .surbub("Stellenbosch")
//                .zipCode("7600")
//                .build();
//        addressService = new AddressServiceImpl();
//        addressService.addAddress(App.getAppContext(), address);
//        addressService.postAddress(address);
//        System.out.print("Address Saved!!");
//    }
//}
