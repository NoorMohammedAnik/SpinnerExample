package com.anik.spinnerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.weiwangcn.betterspinner.library.BetterSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialSpinner spinner = (MaterialSpinner) findViewById(R.id.spinner);
        spinner.setItems("Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow","Ice Cream Sandwich", "Jelly Bean","Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow","Ice Cream Sandwich", "Jelly Bean","Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow","Ice Cream Sandwich", "Jelly Bean");

        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

//        String[] beer = new String[100];
//        for (int i = 0; i < beer.length;) {
//            beer[i] = String.format("%d beer on the wall", ++i);
//        }
//        spinner.setItems(beer);

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                Toast.makeText(MainActivity.this, "Clicked "+item, Toast.LENGTH_SHORT).show();
            }
        });


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        BetterSpinner textView = (BetterSpinner)
                findViewById(R.id.autotxt_view);
        textView.setAdapter(adapter);
    }

    private static final String[] COUNTRIES = new String[] {
            "Belgium", "France", "Italy", "Germany", "Spain","Belgium", "France", "Italy", "Germany", "Spain","Belgium", "France", "Italy", "Germany", "Spain"
    };

}

