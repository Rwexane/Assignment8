package cput.ac.za.dogpound.factories.treatment;

import cput.ac.za.dogpound.domain.TreatmentSupplier;

public class TreatmentSupplerFactory {

    //singleton
    private static TreatmentSupplerFactory instance=null;

    private TreatmentSupplerFactory(){}

    public static TreatmentSupplerFactory getInstance(){
        if (instance == null) {
            instance = new TreatmentSupplerFactory();
        }
        return instance;
    }

    public static TreatmentSupplier createTreatment(Long code,
                                                    String supplierName,
                                                    String treatmentName){
        return new TreatmentSupplier.Builder()
                 .code(code)
                 .supplierName(supplierName)
                 .treatmentName(treatmentName)
                 .build();
    }


}
