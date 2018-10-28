package cput.ac.za.dogpound;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class AdoptionMenu extends Activity {
    Button add, delete,viewById,ViewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adoption_menu_activity);
        add=(Button)findViewById(R.id.add);
        delete=(Button)findViewById(R.id.delete);
        viewById=(Button)findViewById(R.id.viewById);
        ViewAll=(Button)findViewById(R.id.viewAll);
        final Context context=this;

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,AdAdoption.class);
                startActivity(i);
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,DeleteAdoption.class);
                startActivity(i);
            }
        });

        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,Search.class);
                startActivity(i);
            }
        });
    }
}
