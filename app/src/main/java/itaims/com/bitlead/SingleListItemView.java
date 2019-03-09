package itaims.com.bitlead;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SingleListItemView extends Activity

{
    Button b1;
    String[] status = {"Select any status", "Cold", "Hot", "Warm"};
    String[] action = {"Select any action", "Email", "Home Visit", "Showroom Visit", "Telephone"};
    String[] enquiry = {"Select any enquiry", "Evluation for Exch", "Exploration", "Finance Documentation", "Finance Options Eval", "Negotiation", "Order Booking", "Proforma Invoice", "Test Drive"};
    String[] nextaction = {"Select any nextaction", "Email", "Home Visit", "Showroom Visit", "Telephone"};
    String[] nextenquiry = {"Select any nextenquiry", "Evluation for Exch", "Exploration", "Finance Documentation", "Finance Options Eval", "Negotiation", "Order Booking", "Proforma Invoice", "Test Drive"};

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_list_item_view);

        ActionBar actionBar = getActionBar();

        final Spinner spin1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter stat = new ArrayAdapter(this, R.layout.spinner, status);
        stat.setDropDownViewResource(R.layout.spinner);
        spin1.setAdapter(stat);

        final Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter act = new ArrayAdapter(this, R.layout.spinner, action);
        act.setDropDownViewResource(R.layout.spinner);
        spin2.setAdapter(act);

        final Spinner spin3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter enq = new ArrayAdapter(this, R.layout.spinner, enquiry);
        enq.setDropDownViewResource(R.layout.spinner);
        spin3.setAdapter(enq);

        final Spinner spin4 = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter nexact = new ArrayAdapter(this, R.layout.spinner, nextaction);
        nexact.setDropDownViewResource(R.layout.spinner);
        spin4.setAdapter(nexact);

        final Spinner spin5 = (Spinner) findViewById(R.id.spinner5);
        ArrayAdapter nexenq = new ArrayAdapter(this, R.layout.spinner, nextenquiry);
        nexenq.setDropDownViewResource(R.layout.spinner);
        spin5.setAdapter(nexenq);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    if (spin1.getSelectedItemPosition()==0 || spin2.getSelectedItemPosition()==0 || spin3.getSelectedItemPosition()==0 || spin4.getSelectedItemPosition()==0 || spin5.getSelectedItemPosition()==0)
                    {
                        Toast.makeText(getApplicationContext(),"Please select empty field",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}