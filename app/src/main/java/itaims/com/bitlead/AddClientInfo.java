package itaims.com.bitlead;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddClientInfo extends Activity
{
    Button b1;
    EditText et1, et2, et3,et4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addclient_info);

        b1 = findViewById(R.id.button1);
        et1 = findViewById(R.id.name);
        et2 = findViewById(R.id.phone);
        et3 = findViewById(R.id.email);
        et4 = findViewById(R.id.interest);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();
            }
        });
    }

    private boolean validate()
    {
        String MobilePattern = "[0-9]{10}";
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (et1.length() > 25)
        {
            Toast.makeText(getApplicationContext(), "pls enter less then 25 character in name", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (et4.length() > 25)
        {
            Toast.makeText(getApplicationContext(), "pls enter less then 25 character in interest", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (et3.length() > 50)
        {
            Toast.makeText(getApplicationContext(), "pls enter less then 50 character in email", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (et1.length() == 0 || et2.length() == 0 || et3.length() == 0 )
        {
            Toast.makeText(getApplicationContext(), "pls fill the empty fields", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (et2.getText().toString().matches(MobilePattern) && et3.getText().toString().matches(emailPattern))
        {
            Log.d("start","hi");

            Intent i = new Intent(AddClientInfo.this, LeadListFragment.class);
            startActivity(i);
            return true;
        }
        else if (!et2.getText().toString().matches(MobilePattern))
        {
            Toast.makeText(getApplicationContext(), "Please enter valid 10 digit phone number", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (!et3.getText().toString().matches(emailPattern))
        {
            Toast.makeText(getApplicationContext(), "Please Enter Valid Email Address", Toast.LENGTH_SHORT).show();
            return false;
        }
        return false;
    }
}