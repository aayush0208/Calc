package com.example.itachi.calculator;

import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button zero,one,two,three,four,five,six,seven,eight,nine,div,mul,add,sub,equal,clear;
    private TextView input,result;
    private final char ADDITION='+';
    private final char SUBTRACT='-';
    private final char MULTIPILCATION='*';
    private final char DIVISION='/';
    private final char EQU='=';
    private Double val1=Double.NaN;
    private Double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UIsetup();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            input.setText(input.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"+");
                input.setText(null);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"+");
                input.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"-");
                input.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                ACTION=MULTIPILCATION;
                result.setText(String.valueOf(val1)+"*");
                input.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1)+"/");
                input.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation();
                ACTION=EQU  ;
                result.setText(result.getText().toString()+ String.valueOf(val2)+"=" + String.valueOf(val1));
                input.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().length()>0){
                    CharSequence name=input.getText().toString();
                    input.setText(name.subSequence(0,name.length()-1));
                }else{
                    val1=Double.NaN;
                    val2=Double.NaN;
                    input.setText(null);
                    result.setText(null);
                }
            }
        });
    }
    public void UIsetup(){
        zero=(Button)findViewById(R.id.btn_zero);
        one=(Button)findViewById(R.id.btn_one);
        two=(Button)findViewById(R.id.btn_two);
        three=(Button)findViewById(R.id.btn_three);
        four=(Button)findViewById(R.id.btn_four);
        five=(Button)findViewById(R.id.btn_five);
        six=(Button)findViewById(R.id.btn_six);
        seven=(Button)findViewById(R.id.btn_seven);
        eight=(Button)findViewById(R.id.btn_eight);
        nine=(Button)findViewById(R.id.btn_nine);
        equal=(Button)findViewById(R.id.btn_equal);
        clear=(Button)findViewById(R.id.btn_clear);
        add=(Button)findViewById(R.id.btn_add);
        sub=(Button)findViewById(R.id.btn_sub);
        mul=(Button)findViewById(R.id.btn_mul);
        div=(Button)findViewById(R.id.btn_div);
        input=(TextView)findViewById(R.id.txt_input);
        result=(TextView)findViewById(R.id.txt_result);
    }
    private void operation(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(result.getText().toString());
            switch(ACTION){
                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBTRACT:
                    val1=val1-val2;
                    break;
                case  MULTIPILCATION:
                    val1=val1*val2;
                    break;
                case  DIVISION:
                    val1=val1/val2;
                    break;
                case EQU:
                    break;
            }
        }else{
            val1=Double.parseDouble(result.getText().toString());
        }
    }
}
