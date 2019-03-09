package itaims.com.bitlead;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdatePass extends Activity
{
    Button b1;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updatepass);

        b1=findViewById(R.id.button1);
        et1=findViewById(R.id.editText1);
        et2=findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               validate();
            }
        });
    }
    private boolean validate()
    {
        Log.d("Start validation","hi");
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
        else if (et1.getText().toString().equals("admin")&&
                et2.getText().toString().equals("admin"))
        {
            Intent i=new Intent(UpdatePass.this,Login.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(UpdatePass.this,"not match",Toast.LENGTH_LONG).show();
            return false;
        }
        return false;
    }

}
