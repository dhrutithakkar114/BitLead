package itaims.com.bitlead;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText et1,et2;
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        b1 = findViewById(R.id.button);
        t1 = findViewById(R.id.textView1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                validate();
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, ForgetPass.class);
                startActivity(i);
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
                Intent i=new Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
            else
            {
                Toast.makeText(Login.this,"wrong username and password",Toast.LENGTH_LONG).show();
                return false;
            }
        return false;
        }
}