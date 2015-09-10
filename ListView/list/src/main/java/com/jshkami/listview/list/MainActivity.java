package com.jshkami.listview.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] names = {"Juliet", "Mary", "Julie", "Cate", "Ory", "Flavin", "Martin", "Sammy", "Paul", "Peter"};
        ListAdapter Adapter_1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names );
        ListView Listview1 = (ListView) findViewById(R.id.listview1);
        Listview1.setAdapter(Adapter_1);

        Listview1.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String names = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(getApplication(), names, Toast.LENGTH_SHORT).show();

                    }
                }

        );




    }


}
