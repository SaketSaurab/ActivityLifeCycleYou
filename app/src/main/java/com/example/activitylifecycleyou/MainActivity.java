package com.example.activitylifecycleyou;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtnLaunchSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLaunchSecondActivity=findViewById(R.id.btnLaunchSecondActivity);
        mBtnLaunchSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
                Log.d("MainActivity","onCreate");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }

}