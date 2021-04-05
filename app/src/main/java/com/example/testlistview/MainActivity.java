package com.example.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView  myListView=(ListView) findViewById(R.id.ListView);
        TextView myTextView=(TextView) findViewById(R.id.myItemDescription);

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Rosii");
        myArrayList.add("Castraveti");
        myArrayList.add("Ceapa");
        myArrayList.add("Ardei");

        ArrayAdapter  myArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myArrayList);
        myListView.setAdapter(myArrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemDescription = myArrayList.get(position).toString();
                myTextView.setText(itemDescription);
            }
        });




    }
}