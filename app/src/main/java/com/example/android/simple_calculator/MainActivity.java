package com.example.android.simple_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText result;
    private EditText value;
    private Button left;
    private Button right;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button point;
    private Button add;
    private Button substract;
    private Button multiply;
    private Button division;
    private Button modulus;
    private Button ac;
    private Button equal;

    private String str="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three =(Button)findViewById(R.id.three);
        four =(Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven =(Button)findViewById(R.id.seven);
        eight =(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        point=(Button)findViewById(R.id.point);
        add=(Button)findViewById(R.id.addition);
        substract=(Button)findViewById(R.id.substraction);
        multiply=(Button)findViewById(R.id.multply);
        division=(Button)findViewById(R.id.division);
        modulus=(Button)findViewById(R.id.modulus);
        ac=(Button)findViewById(R.id.clear);
        equal=(Button)findViewById(R.id.equals);
        left=(Button)findViewById(R.id.leftbracket);
        right=(Button)findViewById(R.id.rightbracket);
        value=(EditText)findViewById(R.id.value);
        result=(EditText)findViewById(R.id.result);

        //one
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("1");
                value.setText(str);

            }
        });

        //two
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("2");
                value.setText(str);

            }
        });

        //three
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("3");
                value.setText(str);

            }
        });

        //four
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("4");
                value.setText(str);

            }
        });

        //five
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("5");
                value.setText(str);

            }
        });


        //six
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("6");
                value.setText(str);

            }
        });

        //seven
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("7");
                value.setText(str);

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("8");
                value.setText(str);

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("9");
                value.setText(str);

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("0");
                value.setText(str);

            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat(".");
                value.setText(str);

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("+");
                value.setText(str);

            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("-");
                value.setText(str);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("*");
                value.setText(str);

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("/");
                value.setText(str);

            }
        });

        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("%");
                value.setText(str);

            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat("(");
                value.setText(str);

            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str=str.concat(")");
                value.setText(str);

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                str="";
                value.setText(str);

            }
        });



    }
}
