package com.example.android.showcontents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();
    }

    public void addListenerOnButton1(){

        imageButton = (ImageButton) findViewById(R.id.imageButton1);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Findingdory is clicked!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(".findingdory");
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButton2(){

        imageButton = (ImageButton) findViewById(R.id.imageButton2);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Inside_Out is clicked!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(".insideout");
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButton3(){

        imageButton = (ImageButton) findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Monster_University is clicked!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(".monsteruniversity");
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButton4(){

        imageButton = (ImageButton) findViewById(R.id.imageButton4);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "The_Secret_Life_Of_Pets is clicked!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(".pets");
                startActivity(intent);
            }
        });
    }

    public void addListenerOnButton5(){

        imageButton = (ImageButton) findViewById(R.id.imageButton5);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Zootopia is clicked!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(".zootopia");
                startActivity(intent);
            }
        });
    }


}
