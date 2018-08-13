package cput.ac.za.dogpound.factories.customer;

import java.sql.Date;

import cput.ac.za.dogpound.domain.Donation;

public class DonationFactory {

    //singleton
    private static DonationFactory instance=null;

    public DonationFactory(){}

    public static DonationFactory getInstance(){
        if (instance == null) {
            instance = new DonationFactory();
        }
        return instance;
    }
    public static Donation createDonation(int donationId,
                                          Date donationDate,
                                          double amount,
                                          String comment)
    {
        return new Donation.Builder(donationDate)
                .amount(amount)
                .comment(comment)
                .donationId(donationId)
                .build();
    }
}
