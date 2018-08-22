package com.androidmanifester.kala;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DateTimePicr extends AppCompatActivity {

    RadioGroup radioGroup;
    CheckBox ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picr);
        radioGroup=findViewById(R.id.rg);
        ch=findViewById(R.id.checkBox);

    }

    DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            String s = dayOfMonth+"/"+(month+1)+"/"+year;
            Toast.makeText(DateTimePicr.this, "selected  date is "+s, Toast.LENGTH_SHORT).show();
        }
    };

    public void datee(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(DateTimePicr.this,onDateSetListener,2018,9,7);
        datePickerDialog.show();
    }

    public void timee(View view) {

    }

    public void shw(View view) {
        String st =ch.isChecked()+"";

        if (ch.isChecked()){

        }else {

        }

        int u =radioGroup.getCheckedRadioButtonId();

        if (u==R.id.radioButton){
            st=st+"\n"+"morning";
        }  else if (u==R.id.radioButton2){
            st=st+"\n"+"evening";

        }

        Toast.makeText(this, ""+st, Toast.LENGTH_SHORT).show();
    }
}
