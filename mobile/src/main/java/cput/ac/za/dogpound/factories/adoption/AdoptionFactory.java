package cput.ac.za.dogpound.factories.adoption;

import cput.ac.za.dogpound.domain.Adoption;

public class AdoptionFactory {

    public static Adoption getAdoption(long id, String dogName, String customerName, String customerSurname, String phonenumber)
    {

        {
            Adoption myAdopt = new Adoption.Builder()
                    .id(id)
                    .dogName(dogName)
                    .customerName(customerName)
                    .customerSurname(customerSurname)
                    .phoneNumber(phonenumber)
                    .build();
            return myAdopt;
        }
    }


}
