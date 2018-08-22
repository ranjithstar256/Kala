package com.androidmanifester.kala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListvwExpl extends AppCompatActivity {
    Spinner listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listvw_expl);
        listView=findViewById(R.id.lv);
        arrayList=new ArrayList<String>();
        arrayList.add("ramu");
        arrayList.add("hfg");
        arrayList.add("dfdg");
        arrayList.add("radsfgmu");
        arrayList.add("fdg");
        arrayList.add("gfgf");

        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

      /*  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListvwExpl.this, ""+arrayList.get(position), Toast.LENGTH_SHORT).show();

            }
        });*/

      listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(ListvwExpl.this, ""+arrayList.get(position), Toast.LENGTH_SHORT).show();
          }

          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });
    }
}
