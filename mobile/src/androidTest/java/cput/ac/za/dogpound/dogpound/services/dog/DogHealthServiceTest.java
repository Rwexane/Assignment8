package cput.ac.za.dogpound.dogpound.services.dog;

import android.test.AndroidTestCase;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.DogHealth;
import cput.ac.za.dogpound.services.dog.Impl.DogHealthServiceImpl;


public class DogHealthServiceTest extends AndroidTestCase {
    private DogHealthServiceImpl dogHealth;





    public void testSaveDogHealth() throws Exception {

        DogHealth aHealth = new DogHealth.Builder()
                .condition("Well")
                .id(Long.parseLong("23432432"))
                .build();
        dogHealth = new DogHealthServiceImpl();
        dogHealth.addHealth(App.getAppContext());
        dogHealth.saveHealth(aHealth);
            System.out.print("DogSaved!!");
    }
}
