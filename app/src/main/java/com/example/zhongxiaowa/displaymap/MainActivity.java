package com.example.zhongxiaowa.displaymap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_welcomepage);
        Button btn_Displaymap=(Button)findViewById(R.id.btn_Displaymap);

        btn_Displaymap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DisplayMap.class);
                startActivity(intent);

            }
        });


    }

}
