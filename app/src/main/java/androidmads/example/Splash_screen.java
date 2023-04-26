package androidmads.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Splash_screen extends AppCompatActivity {

    Button buttonlet;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setStatusBarColor(ContextCompat.getColor(Splash_screen.this,R.color.colorPrimaryDark));

        buttonlet = findViewById(R.id.letsgetbutton);
        buttonlet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Splash_screen.this,Generate_or_scan.class);
                startActivity(i);
                finish();
            }
        });
    }
}