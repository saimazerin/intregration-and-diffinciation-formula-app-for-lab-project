package com.example.saimazerinzeby.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a1);
            }
            
        });
    }
}
