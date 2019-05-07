package com.miss.tooglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton toggle1 = findViewById(R.id.toggle1);
        final ToggleButton toggle2 = findViewById(R.id.toggle2);
        Button Check = findViewById(R.id.cek);
        Check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Mengecek Kondisi pada ToggleButton 1
                if (toggle1.isChecked()){
                    Toast.makeText(getApplicationContext(), "Toggle 1 MENYALA", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Toggle 1 MATI", Toast.LENGTH_SHORT).show();
                }//Mengecek Kondisi pada ToggleButton 2
                if (toggle2.isChecked()){
                    Toast.makeText(getApplicationContext(), "Toggle 2 MENYALA", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Toggle 2 MATI", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
