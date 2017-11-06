package com.example.saimazerinzeby.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main3Activity extends Activity {
    Button d1,d2,d3,d4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        d1=(Button)findViewById(R.id.dt1);
        d2=(Button)findViewById(R.id.dt2);
        d3=(Button)findViewById(R.id.dt3);
        d4=(Button)findViewById(R.id.dt4);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s1 = new Intent(Main3Activity.this, Main6Activity.class);
                startActivity(s1);
            }
        });
        d2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s2=new Intent(Main3Activity.this,Main7Activity.class);
                startActivity(s2);
            }

        });
        d3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s3=new Intent(Main3Activity.this,Main8Activity.class);
                startActivity(s3);
            }

        });
        d4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s4=new Intent(Main3Activity.this,Main9Activity.class);
                startActivity(s4);

            }


        });
    }
}
