package com.androidmanifester.kala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    String s,s1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.tes);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=editText.getText().toString();
                //Toast.makeText(MainActivity.this, "name typed  is "+s, Toast.LENGTH_SHORT).show();
                //textView.setText(s);
                Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("navneeth",s);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        s1=item.getTitle().toString();
        Toast.makeText(this, ""+s1, Toast.LENGTH_SHORT).show();

        if (s1.equals("balance")){

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
