package com.example.helloconstraint;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Integer contador=0;
    public TextView textView;
    public Toast mensajito;
    public Button BtnCount;
    public Button BtnZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =  findViewById(R.id.CONTADOR);
        BtnCount = findViewById(R.id.COUNT);
        BtnZero =  findViewById(R.id.ZERO);
    }

    public void toast(View view) {
        this.mensajito = Toast.makeText(this, "eva frentona", Toast.LENGTH_LONG);
        this.mensajito.show();
    }

    public void zero(View view) {
        if( textView != null ) {
            this.contador = 0;
            textView.setText(Integer.toString(this.contador));
        }
    }

    public void cambiarColor() {
        if(this.contador > 1){
            this.BtnCount.setBackgroundColor(Color.parseColor('#3BB772'));
            this.BtnZero.setBackgroundColor(Color.parseColor('##DC3C72'));
        }
    }

    public void count(View view) {
        if( textView != null ) {
            textView.setText(Integer.toString((this.contador = this.contador + 1)));
        }
    }
}
