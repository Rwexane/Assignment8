package cput.ac.za.dogpound.dogpound.services.dog;

import android.test.AndroidTestCase;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.LivingArea;
import cput.ac.za.dogpound.services.dog.Impl.LivingAreaServiceImpl;


public class LivingAreaServiceTest extends AndroidTestCase {


    private LivingAreaServiceImpl livingArea;


    public void testSaveDog() throws Exception {

        LivingArea lArea = new LivingArea.Builder()
                .livingAreaId(Long.parseLong("43344"))
                .livingAreaName("Kraal")
                .build();


        livingArea = new LivingAreaServiceImpl();
        livingArea.addLivingArea(App.getAppContext());
        livingArea.saveLivingAra(lArea);
        System.out.print("LivingAreaSaved!!");
    }
}