package cput.ac.za.dogpound.factories.customer;

import java.sql.Date;

import cput.ac.za.dogpound.domain.Adoption;

public class AdoptionFactory {

    //singleton
    private static AdoptionFactory instance=null;

    public AdoptionFactory(){}

    public static AdoptionFactory getInstance(){
        if (instance == null) {
            instance = new AdoptionFactory();
        }
        return instance;
    }

    public static Adoption createAdoption(Long adoptionId, String comment,
                                          Date adoptionDate)
    {
        return new Adoption.Builder()
                .adoptionId(adoptionId)
                .adoptionDate(adoptionDate)
                .comment(comment)
                .build();
    }
}
