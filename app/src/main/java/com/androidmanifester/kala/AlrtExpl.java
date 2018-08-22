package com.androidmanifester.kala;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlrtExpl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alrt_expl);

    }

    public void navt(View view) {

        AlertDialog.Builder builder= new AlertDialog.Builder(AlrtExpl.this);
        builder.setTitle("Caution!");
        builder.setMessage("Confirm delete?");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setPositiveButton("navne", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlrtExpl.this, "yes wrking!", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();

    }   
}
