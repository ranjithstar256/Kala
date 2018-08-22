package com.androidmanifester.kala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class SmsActy extends AppCompatActivity {
    EditText  editText,editText2;
    String num,msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_acty);
        editText=findViewById(R.id.editText3);
        editText2=findViewById(R.id.editText4);
    }

    public void sendsmss(View view) {
        num=editText.getText().toString();
        msg=editText2.getText().toString();
        //implict=opening a buildin activity ex: camera , browser
///  explict=switching between user defined activies

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(num,null,msg,null,null);
    }
}
