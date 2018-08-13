package cput.ac.za.dogpound.dogpound.services.customer;

import android.test.AndroidTestCase;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.conf.AppUtil;
import cput.ac.za.dogpound.domain.Adoption;
import cput.ac.za.dogpound.services.customer.Impl.AdoptionServiceImpl;

public class AdoptionServiceTest extends AndroidTestCase {

    private AdoptionServiceImpl adoptionService;

    public void testSaveAdoption() throws Exception {

        Adoption address = new Adoption.Builder()
               .adoptionId(Long.parseLong("34324"))
                .adoptionDate(AppUtil.getDate("23/43/2016"))
                .comment("Adopted")
                .build();
        adoptionService =   new AdoptionServiceImpl();
        adoptionService.addAdoption(App.getAppContext());
        adoptionService.saveAdoption(address);
        System.out.print("AdoptionSaved!!");
    }
}
