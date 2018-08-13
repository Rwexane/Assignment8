package cput.ac.za.dogpound.factories.dog;

import java.sql.Date;
import java.util.List;

import cput.ac.za.dogpound.domain.DogHealth;
import cput.ac.za.dogpound.domain.MedicalHistory;

public class MedicalHistoryFactory {

    //singleton
    private static MedicalHistoryFactory instance=null;

    public MedicalHistoryFactory(){}

    public static MedicalHistoryFactory getInstance(){
        if (instance == null) {
            instance = new MedicalHistoryFactory();
        }
        return instance;
    }
    private List<DogHealth> infection;

    public static MedicalHistory createMedHistory(Long medId,
                                                  String description,
                                                  Date date,
                                                  List<DogHealth> infection)
    {
        return new MedicalHistory.Builder()
                .medID(medId)
                .description(description)
                .date(date)
                .infections(infection)
                .build();
    }
}
