package com.androidmanifester.kala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button button;
    EditText  editText;
    String s;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=findViewById(R.id.button2);
        editText=findViewById(R.id.editText2);
        textView=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=editText.getText().toString();
                Toast.makeText(Main3Activity.this, s, Toast.LENGTH_SHORT).show();
                textView.setText(s);

              /*  Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);*/
            }
        });
    }
}
