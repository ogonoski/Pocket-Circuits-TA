package com.example.appnov26;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        Intent intent1 = getIntent();
        Button lab1VIR = (Button) findViewById(R.id.lab1_vir);
        lab1VIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab1VIRintent = new Intent(getApplicationContext(), VIR.class);
                startActivity(lab1VIRintent);
            }
        });
        Button lab1EQR = (Button) findViewById(R.id.lab1_eqr);
        lab1EQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lab1EQRintent = new Intent(getApplicationContext(), EquivalentResistance.class);
                startActivity(lab1EQRintent);
            }
        });
    }
}