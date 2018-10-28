package cput.ac.za.dogpound;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button adoptions, customers,dogs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adoptions=(Button)findViewById(R.id.adoptions);
        customers=(Button)findViewById(R.id.customers);
        dogs=(Button)findViewById(R.id.dogs);
        final Context context=this;

        customers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This feature will be available on the next version of this app", Toast.LENGTH_LONG).show();
            }
        });

        adoptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,AdoptionMenu.class);
                startActivity(i);

            }
        });

        dogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This feature will be available on the next version of this app", Toast.LENGTH_LONG).show();
            }
        });
    }

}

