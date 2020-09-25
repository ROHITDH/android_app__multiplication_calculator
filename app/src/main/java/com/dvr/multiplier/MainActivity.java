package com.dvr.multiplier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dvr.multiplier.R;

public class MainActivity extends AppCompatActivity {
    int count1=0,count2=0,count3=0,count4=0; //to store value of multiplication
    int ans1=0,ans2=0,ans3=0,ans4=0;//to store result of multiplication
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //display1,display2,submit1,submit2 works for multiplication of 2
    //diaplay 1 is the value we are multiplying by and
    //display 2 is the result of multiplication
    //submit 1 increments the value of multiplication by 2
    //submit 2 decrements the value of multiplication by 2
    private void display1(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView7);
        quantityTextView.setText(""+num);
    }
    private void display2(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView5);
        quantityTextView.setText(""+num);
    }
    public void submit1(View view){
        count1=count1+1;
        ans1=ans1+2;
        display1(count1);
        display2(ans1);
    }
    public void submit2(View view) {
        count1=count1-1;
        ans1=ans1-2;
        display1(count1);
        display2(ans1);
    }
    //display3,display4,submit3,submit4 works for multiplication of 3
    //diaplay 3 is the value we are multiplying by and
    //display 4 is the result of multiplication
    //submit 3 increments the value of multiplication by 3
    //submit 4 decrements the value of multiplication by 3
    private void display3(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView12);
        quantityTextView.setText(""+num);
    }
    private void display4(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView14);
        quantityTextView.setText(""+num);
    }
    public void submit3(View view){
        count2=count2+1;
        ans2=ans2+3;
        display3(count2);
        display4(ans2);
    }
    public void submit4(View view) {
        count2 = count2 - 1;
        ans2 = ans2 - 3;
        display3(count2);
        display4(ans2);
    }
    //display5,display6,submit5,submit6 works for multiplication of 4
    //diaplay 5 is the value we are multiplying by and
    //display 6 is the result of multiplication
    //submit 5 increments the value of multiplication by 4
    //submit 6 decrements the value of multiplication by 4

    private void display5(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView17);
        quantityTextView.setText(""+num);
    }
    private void display6(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView19);
        quantityTextView.setText(""+num);
    }
    public void submit5(View view){
        count3=count3+1;
        ans3=ans3+4;
        display5(count3);
        display6(ans3);
    }
    public void submit6(View view) {
        count3 = count3 - 1;
        ans3 = ans3 - 4;
        display5(count3);
        display6(ans3);
    }
    //display7,display8,submit7,submit8 works for multiplication of 5
    //diaplay 7 is the value we are multiplying by and
    //display 8 is the result of multiplication
    //submit 7 increments the value of multiplication by 5
    //submit 8 decrements the value of multiplication by 5

    private void display7(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView22);
        quantityTextView.setText(""+num);
    }
    private void display8(int num){
        TextView quantityTextView = (TextView) findViewById(R.id.textView24);
        quantityTextView.setText(""+num);
    }
    public void submit7(View view){
        count4=count4+1;
        ans4=ans4+5;
        display7(count4);
        display8(ans4);
    }
    public void submit8(View view) {
        count4 = count4 - 1;
        ans4 = ans4 - 5;
        display7(count4);
        display8(ans4);
    }

}