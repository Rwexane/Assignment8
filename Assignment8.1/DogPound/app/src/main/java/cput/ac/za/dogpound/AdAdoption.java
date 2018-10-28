package cput.ac.za.dogpound;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import cput.ac.za.dogpound.services.Adoption.AdoptionService;
import cput.ac.za.dogpound.services.Adoption.impl.AdoptionImpl;

public class AdAdoption extends Activity {

    private EditText adopterName;
    private EditText adopterSurname;
    private EditText dogName;
    final Context context = this;
    private EditText phonenumber;
    AdoptionService service;

    public AdAdoption() {
        service = new AdoptionImpl();
    }

    @SuppressLint("ResourceType")
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ad_adoption_activity);
        StrictMode.setThreadPolicy((new StrictMode.ThreadPolicy.Builder()).permitAll().build());
        ((Button) findViewById(R.id.adoptions)).setOnClickListener(new View.OnClickListener() {

            final AdAdoption this$0;

            public void onClick(View view) {
                dogName = (EditText) findViewById(R.id.newdogname);
                adopterName = (EditText) findViewById(R.id.newadoptername);
                adopterSurname = (EditText) findViewById(R.id.newadoptersurname);
                phonenumber = (EditText) findViewById(R.id.adopterphonenumber);
               // view = (new cput.ac.za.dogpound.domain.Adoption.Builder()).Dogname(dogName.getText().toString()).customerName(adopterName.getText().toString()).customerSurname(adopterSurname.getText().toString()).phoneNumber("0833456789").build();
                service.save(view);
                dogName.getText().clear();
                adopterName.getText().clear();
                adopterSurname.getText().clear();
                phonenumber.getText().clear();
                Toast.makeText(getApplicationContext(), "Adoption Saved", 0).show();
            }


            {
                this$0 = AdAdoption.this;
                //super();
            }
        });
    }

}