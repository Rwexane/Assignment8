package cput.ac.za.dogpound.dogpound.services.treatment;

import android.test.AndroidTestCase;

import cput.ac.za.dogpound.conf.App;
import cput.ac.za.dogpound.domain.Treatment;
import cput.ac.za.dogpound.services.treatment.Impl.TreatmentServiceImpl;

public class TreatmentServiceTest extends AndroidTestCase {

    private TreatmentServiceImpl treatmentService;

    public void testSaveTreatment() throws Exception {

        Treatment treatment = new Treatment.Builder()
                .treatmentNO(Long.parseLong("324"))
                .Instructions("Twice a day")
                .ExpiryDate("23/05/17")
                .build();
        treatmentService = new TreatmentServiceImpl();
        treatmentService.addTreatment(App.getAppContext());
        treatmentService.saveTreatment(treatment);
        System.out.print("TreatmentSaved!!");
    }
}
