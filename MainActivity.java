//13082021_10118387_IF-9_IgaFebyolaMambi
package com.example.uts_akb_10118387_if_9_igafebyolamambi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button gabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gabung = (Button)findViewById(R.id.btnGabung);

        gabung.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent ( MainActivity.this, SplashscreenActivity.class);
                startActivity(i);
            }
        });
    }
}