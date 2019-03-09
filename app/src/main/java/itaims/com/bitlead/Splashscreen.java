package itaims.com.bitlead;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        EasySplashScreen config=new EasySplashScreen(Splashscreen.this)
                .withFullScreen()
                .withTargetActivity(Login.class)
                .withSplashTimeOut(1000)
                .withBackgroundColor(Color.parseColor("#FFFFFF"))
                .withLogo(R.drawable.logo)
                .withHeaderText("Welcome!!");

        config.getHeaderTextView().setTextColor(Color.BLACK);

        View view = config.create();
        setContentView(view);

    }
}
