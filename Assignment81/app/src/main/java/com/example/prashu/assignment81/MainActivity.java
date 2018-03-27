package com.example.prashu.assignment81;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private ListView mListView;
  private ArrayList<String> mArrayList;
  private Button asc;
  private Button dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView=findViewById(R.id.listview);
        asc = findViewById(R.id.button3);
        dec = findViewById(R.id.button);

        asc.setOnClickListener(this);
        dec.setOnClickListener(this);

        mArrayList= new ArrayList<>();
        monthsArray();
        ArrayAdapter<String> mArrayAdapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_expandable_list_item_1,mArrayList
        );
        mListView.setAdapter(mArrayAdapter);

    }

    private void monthsArray() {
        mArrayList.add("January");
        mArrayList.add("February");
        mArrayList.add("March");
        mArrayList.add("April");
        mArrayList.add("May");
        mArrayList.add("June");
        mArrayList.add("July");
        mArrayList.add("August");
        mArrayList.add("September");
        mArrayList.add("October");
        mArrayList.add("November");
        mArrayList.add("December");


    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.button3:
                Collections.sort(mArrayList);
                ArrayAdapter<String> mArrayAdapter2= new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_expandable_list_item_1,mArrayList
                );
                mListView.setAdapter(mArrayAdapter2);
                break;


            case R.id.button:
                Collections.sort(mArrayList,Collections.<String>reverseOrder());
                ArrayAdapter<String> mArrayAdapter1= new ArrayAdapter<String>
                        (MainActivity.this,android.R.layout.simple_expandable_list_item_1,mArrayList
                );
                mListView.setAdapter(mArrayAdapter1);
                break;



        }

    }
}
