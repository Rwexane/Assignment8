package cput.ac.za.dogpound.factories.dog;

import cput.ac.za.dogpound.domain.DogRecord;

public class DogRecordFactory {

    //singleton
    private static DogRecordFactory instance=null;

    public DogRecordFactory(){}

    public static DogRecordFactory getInstance(){
        if (instance == null) {
            instance = new DogRecordFactory();
        }
        return instance;
    }
    public static DogRecord createDonation(Long id, String arrivalDate ,
                                           String leavingDate)
    {
        return new DogRecord.Builder()
                .id(id)
                .arrivalDate(arrivalDate)
                .leavingDate(leavingDate)
                .build();
    }

}
