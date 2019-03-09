package itaims.com.bitlead;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.dpizarro.pinview.library.PinView;
import com.dpizarro.pinview.library.PinViewSettings;

import static itaims.com.bitlead.R.*;

public class ForgetOtp extends Activity
{
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(layout.forgetotp);


        PinView pinView = (PinView) findViewById(R.id.pinView);
        String[] a= {"A","B","C","D"};
        PinViewSettings pinViewSettings = new PinViewSettings.Builder()
                .withPinTitles(a)
                .withMaskPassword(true)
                .withDeleteOnClick(true)
                .withKeyboardMandatory(false)
                .withSplit("-")
                .withNumberPinBoxes(4)
                .withNativePinBox(false)
                .build();

        pinView.setSettings(pinViewSettings);
        b1=findViewById(id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ForgetOtp.this,UpdatePass.class);
                startActivity(i);
            }
        });
    }
}