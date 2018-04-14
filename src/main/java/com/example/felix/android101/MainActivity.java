package com.example.felix.android101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    public final String TAG  = "Logged";
    String[] drinks = {"Hunters", "Kibao", "KC", "Napoleon", "Tusker", "Whitecap","Johnie Walker", "Jack Daniels", "Jameson","Summit"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, drinks);
        list.setAdapter(adapter);
         list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 
//                 Toast.makeText(MainActivity.this, "Your are drinking "+drinks[position], Toast.LENGTH_SHORT).show();
             }
         });

    }
}
