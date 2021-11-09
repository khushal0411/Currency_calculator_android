package com.example.airthmetic_and_currency_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

Button btn_currency_calc,btn_calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView Nav_view= findViewById(R.id.navigation);
        Nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @org.jetbrains.annotations.NotNull MenuItem item) {
                int itemId = item.getItemId();
                if(itemId==R.id.Calculator)
                {
                    Intent intent=new Intent(MainActivity.this,Calculator.class);
                    startActivity(intent);
                    return  true;
                }
                if(itemId==R.id.Currency_converter);
                {
                    Intent intent=new Intent(MainActivity.this,currency_calculator.class);
                    startActivity(intent);
                    return true;
                }

            }
        });

        //btn_currency_calc=findViewById(R.id.btn_currency_calc);
        //btn_calc=findViewById(R.id.btn_calc);
        /*btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Calculator.class);
                startActivity(intent);
            }
        });

        btn_currency_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,currency_calculator.class);
                startActivity(intent);
            }
        });*/

    }
}