package cput.ac.za.dogpound.factories.treatment;

import cput.ac.za.dogpound.domain.Treatment;

public class TreatmentFactory {

    //singleton
    private static TreatmentFactory instance=null;

    private TreatmentFactory(){}

    public static TreatmentFactory getInstance(){
        if (instance == null) {
            instance = new TreatmentFactory();
        }
        return instance;
    }
    public static Treatment createTreatment(Long treatmentNO,
                                            String expiryDate,
                                            String instructions){

        return new Treatment.Builder()
                .treatmentNO(treatmentNO)
                .Instructions(instructions)
                .ExpiryDate(expiryDate)
                .build();
    }
}
