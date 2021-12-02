package com.codewithdevesh.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.skyfishjy.library.RippleBackground;
import com.wuyr.rippleanimation.RippleAnimation;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    ImageView bDot,bEqual,bAc,bPlus,bMinus,bMult,bDiv,bFact,bPercent,bBracket;
    ImageView th;
    RelativeLayout relativeLayout;
    TextView t1,t2;
    String data;
    boolean flag = false;
    boolean myMode;
    String ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btn_1);
        b2 = findViewById(R.id.btn_2);
        b3 = findViewById(R.id.btn_3);
        b4 = findViewById(R.id.btn_4);
        b5 = findViewById(R.id.btn_5);
        b6 = findViewById(R.id.btn_6);
        b7 = findViewById(R.id.btn_7);
        b8 = findViewById(R.id.btn_8);
        b9 = findViewById(R.id.btn_9);
        b0 = findViewById(R.id.btn_0);
        bDot = findViewById(R.id.btn_point);
        bEqual = findViewById(R.id.btn_equal);
        bAc = findViewById(R.id.btn_ac);
        bPlus = findViewById(R.id.btn_plus);
        bMinus = findViewById(R.id.btn_minus);
        bMult = findViewById(R.id.btn_mult);
        bDiv = findViewById(R.id.btn_divide);
        bFact = findViewById(R.id.btn_fact);
        bPercent = findViewById(R.id.btn_percent);
        bBracket = findViewById(R.id.btn_bracket);
        t1 = findViewById(R.id.tv_input_txt);
        t2 = findViewById(R.id.tv_input_txt2);
        th = findViewById(R.id.theme_app);
        relativeLayout = findViewById(R.id.rl);

        myMode= getResources().getString(R.string.mode).equals("Day");

        th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(myMode){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"0");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"1");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"2");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"3");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"4");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"5");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"6");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"7");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"8");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"9");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+".");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        bAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"+");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });


        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"-");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });


        bMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"×");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });


        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"÷");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });
        bFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft = t1.getText().toString();
                t1.setText(ft+"!");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
                if(!ft.isEmpty()) {
                    int x = Integer.parseInt(ft);
                    int res = factorial(x);
                    String res_s = String.valueOf(res);
                    t2.setText(res_s);
                    Animation anim2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                    t2.startAnimation(anim2);
                    t2.setSelected(true);

                }else{
                    t1.setText("");
                    t2.setText("");
                    Toast.makeText(getApplicationContext(), "Enter data to calculate", Toast.LENGTH_SHORT).show();
                }

            }
        });
        bPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = t1.getText().toString();
                t1.setText(data+"%");
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                t1.startAnimation(anim);
            }
        });

        bBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(flag){
                    data = t1.getText().toString();
                    t1.setText(data+")");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                    t1.startAnimation(anim);
                    flag=false;
                }else{
                    data = t1.getText().toString();
                    t1.setText(data+"(");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                    t1.startAnimation(anim);
                    flag=true;

                }
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(data.isEmpty()){
                    t1.setText("");
                    t2.setText("");
                    Toast.makeText(getApplicationContext(), "Enter data to calculate", Toast.LENGTH_SHORT).show();
                }else{
                        data  = t1.getText().toString();
                        data = data.replace("×","*");
                        data = data.replace("÷","/");
                        data = data.replace("%","/100");

                    Context rh = Context.enter();
                    rh.setOptimizationLevel(-1);

                    String ans = "";
                    try {
                        Scriptable sc = rh.initStandardObjects();
                        ans = rh.evaluateString(sc, data, "Javascript", 1, null).toString();
                    }catch (Exception e){
                        ans="0";
                    }
                    t2.setText(ans);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_int_top);
                    t2.startAnimation(anim);
                    t2.setSelected(true);

                }
            }
        });

    }
    public int factorial(int x){
        if(x>=1){
            return x*factorial(x-1);
        }else{
            return 1;
        }
    }
}