package com.xyz.trainadventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etFrom, etTo;
    Spinner spnClass;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFrom = (EditText) findViewById(R.id.etFrom);
        etTo = (EditText) findViewById(R.id.etTo);
        spnClass = (Spinner) findViewById(R.id.spnClass);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        final ArrayList<String> cat = new ArrayList<>();
        cat.add("First Class");
        cat.add("Second Class");
        cat.add("Sleeper Class");

        ArrayAdapter<String> catAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cat);
        spnClass.setAdapter(catAdapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String m1 = etFrom.getText().toString();
                String m2 = etTo.getText().toString();

                int s1 = spnClass.getSelectedItemPosition();
                String m3 = cat.get(s1);

                String m = m1 + " to " + m2 + ":" + m3;

                Toast.makeText(getApplicationContext(), m, Toast.LENGTH_LONG).show();

            }
        });

    }
}
