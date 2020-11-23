package com.example.foser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bStart, bStop, bRestart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bStart = findViewById(R.id.buttonStart);
        bStop = findViewById(R.id.buttonStop);
        bRestart = findViewById(R.id.buttonRestart);

        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickStart(view);
            }
        });
        bStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickStop(view);
            }
        });
        bRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickRestart(view);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemSettings: startActivity(new Intent(this,SettingsActivity.class)); return true;
            case R.id.itemExit: finishAndRemoveTask(); return true;
            default: return super.onOptionsItemSelected(item);
        }
    }



    public void clickStart(View view) {
                Toast.makeText(view.getContext(),"Start",Toast.LENGTH_LONG).show();
    }

    public void clickStop(View view) {
                Toast.makeText(view.getContext(),"Stop",Toast.LENGTH_LONG).show();
    }

    public void clickRestart(View view) {
                clickStop(view);
                clickStart(view);
    }
}