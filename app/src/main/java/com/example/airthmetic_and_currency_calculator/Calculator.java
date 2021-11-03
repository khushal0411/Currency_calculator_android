package com.example.airthmetic_and_currency_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
    TextView result;
    EditText Num1,Num2;
    Button mul,div,add,c,sub,btn_backtohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result = findViewById(R.id.tv_Result);
        Num1 = findViewById(R.id.edittext_Num1);
        Num2 = findViewById(R.id.edittext_Num2);
        mul = findViewById(R.id.button_mul);
        div = findViewById(R.id.button_div);
        add = findViewById(R.id.button_add);
        c = findViewById(R.id.button_clear);
        sub = findViewById(R.id.button_sub);
        btn_backtohome=findViewById(R.id.btn_backtohome);
        btn_backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Calculator.this,MainActivity.class);
                startActivity(intent);
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }
                if(z==0)
                {
                    addd = a1 + b1;
                    result.setText(Float.toString(addd));}
                else {
                    result.setText("Invalid");
                }


            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }
                if(z==0)
                {
                    addd = a1 - b1;
                    result.setText(Float.toString(addd));}
                else {
                    result.setText("Invalid");
                }



            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }
                if(z==0)
                {
                    addd = a1 * b1;
                    result.setText(Float.toString(addd));}
                else {
                    result.setText("Invalid Input");
                }


            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float addd=0;
                float a1=0, b1=0,z=0;
                try {
                    a1 = Float.parseFloat(Num1.getText().toString());
                    b1 = Float.parseFloat(Num2.getText().toString());
                }
                catch (NumberFormatException e)
                {
                    z=1;
                }

                if(z==0)
                {
                    try {
                        addd = a1 / b1;
                    }
                    catch (ArithmeticException e)
                    {
                        z=1;
                    }
                    if(z==0){
                        result.setText(Float.toString(addd));
                    }
                    else {
                        result.setText("Number divided by 0, Re-enter number");
                    }

                }
                else {
                    result.setText("Invalid");
                }


            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Num1.setText(" ");
                Num2.setText(" ");
                result.setText(" ");
            }
        });

    }
}