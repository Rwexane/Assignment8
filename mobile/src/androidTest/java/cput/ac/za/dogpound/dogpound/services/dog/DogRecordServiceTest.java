package cput.ac.za.dogpound.dogpound.services.dog;

import android.test.AndroidTestCase;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.DogRecord;
import cput.ac.za.dogpound.services.dog.Impl.DogRecordServiceImpl;


public class DogRecordServiceTest extends AndroidTestCase {
    private DogRecordServiceImpl dogRec;





    public void testSaveDog() throws Exception {

        DogRecord dog = new DogRecord.Builder()
                .id(Long.parseLong("DSFDSF232"))
                .arrivalDate("14/04/2016")
                .leavingDate("14/04/2017")
                .build();


        dogRec = new  DogRecordServiceImpl();
        dogRec.addDog(App.getAppContext());
        dogRec.saveDog(dog);
        System.out.print("DogSaved!!");
    }
}
