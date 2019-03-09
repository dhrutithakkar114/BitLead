package itaims.com.bitlead;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPass extends Activity
{
    Button b1;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgetpass);

        b1=findViewById(R.id.button1);
        et1=findViewById(R.id.phone);
        et2=findViewById(R.id.email);

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

        if (et1.length() > 25 || et2.length() > 25)
        {
            Toast.makeText(getApplicationContext(), "pls enter less the 25 character", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (et1.length() == 0 || et2.length() == 0)
        {
            Toast.makeText(getApplicationContext(), "pls fill the empty fields", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if (et1.getText().toString().matches(MobilePattern) && et2.getText().toString().matches(emailPattern))
        {
            Intent i=new Intent(ForgetPass.this,ForgetOtp.class);
            startActivity(i);
            return true;
        }
        else if(!et1.getText().toString().matches(MobilePattern))
        {
            Toast.makeText(getApplicationContext(), "Please enter valid 10 digit phone number", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!et2.getText().toString().matches(emailPattern))
        {
            Toast.makeText(getApplicationContext(),"Please Enter Valid Email Address",Toast.LENGTH_SHORT).show();
            return false;
        }

        return false;
    }
}