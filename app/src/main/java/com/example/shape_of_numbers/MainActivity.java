package com.example.shape_of_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void listen_1(View view)
    {
        EditText text=findViewById(R.id.editTextNumber);

        int entered_num=Integer.parseInt(text.getText().toString());
        boolean is_triangle=check_triangle(entered_num);
        boolean is_square=check_square(entered_num);
        if(is_square && is_triangle)
        {
            msg="Number is Triangle and square both";
        }
        else if(is_square)
        {
            msg="Number is Square";
        }
        else if(is_triangle)
        {
            msg="Number is triangle";
        }
        else
        {
            msg="Number is neither square nor triangle";
        }
        Toast.makeText(this,"hi"+msg, Toast.LENGTH_LONG).show();
    }
    public boolean check_triangle(int n)
    {
        Log.d("taeg","Square");
        if(n==1)return true;
        int tmp=1;
        int i=2;
        while(tmp<=n)
        {
            if(tmp==n)return true;
            tmp=tmp+i;
            i++;
        }
        return false;
    }
    public boolean check_square(int n)
    {
        Log.d("in","triangle");
        double sqrt=Math.sqrt(n);
        if(sqrt==Math.ceil(sqrt))
            return true;
        return false;
    }
}