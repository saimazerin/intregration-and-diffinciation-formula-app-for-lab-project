package com.example.saimazerinzeby.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends Activity {

    Button f1,f2,f3,f4,f5,f6,f7,f8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        f1=(Button)findViewById(R.id.ft1);
        f2=(Button)findViewById(R.id.ft2);
        f3=(Button)findViewById(R.id.ft3);
        f4=(Button)findViewById(R.id.ft4);
        f5=(Button)findViewById(R.id.ft5);
        f6=(Button)findViewById(R.id.ft6);
        f7=(Button)findViewById(R.id.ft7);
        f8=(Button)findViewById(R.id.ft8);



        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s1 = new Intent(Main4Activity.this, Main10Activity.class);
                startActivity(s1);
            }
        });
        f2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s2=new Intent(Main4Activity.this,Main11Activity.class);
                startActivity(s2);
            }

        });
        f3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s3=new Intent(Main4Activity.this,Main12Activity.class);
                startActivity(s3);
            }

        });
        f4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s4=new Intent(Main4Activity.this,Main13Activity.class);
                startActivity(s4);

            }


        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s1 = new Intent(Main4Activity.this, Main14Activity.class);
                startActivity(s1);
            }
        });
        f6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s2=new Intent(Main4Activity.this,Main15Activity.class);
                startActivity(s2);
            }

        });
        f7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s3=new Intent(Main4Activity.this,Main16Activity.class);
                startActivity(s3);
            }

        });
        f8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent s4=new Intent(Main4Activity.this,Main17Activity.class);
                startActivity(s4);

            }


        });

    }

}
