package com.example.saimazerinzeby.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button e1,e2,e3,e4,e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1=(Button)findViewById(R.id.button3);
        e2=(Button)findViewById(R.id.button8);
        e3=(Button)findViewById(R.id.button9);
        e4=(Button)findViewById(R.id.button10);
        e5=(Button)findViewById(R.id.button11);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r1 = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(r1);
            }
        });
        e2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent r2=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(r2);
            }

        });
        e3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent r3=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(r3);
            }

        });
        e4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent r4=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(r4);

            }


        });
        e5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent r5=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(r5);
            }

        });
    }
}
