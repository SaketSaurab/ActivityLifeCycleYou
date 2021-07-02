package com.example.activitylifecycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button mBtnLaunchActivity2 = findViewById(R.id.btnLaunchActivity3);
        mBtnLaunchActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity2.this,"Button Clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Activity2.this,Activity3.class);
                startActivity(intent);
            }
        });

        Log.d("Activity2","onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity2","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity2","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity2","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity2","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity2","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity2","onDestroy");
    }

}