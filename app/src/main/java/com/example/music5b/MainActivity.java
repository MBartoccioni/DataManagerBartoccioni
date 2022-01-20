package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    EditText txtTitolo;
    GestoreBrani gb;
    Spinner spnGeneri;
    ArrayAdapter <String> aaG;

    String[] generi = {"Pop", "Trap", "Rap"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gb = new GestoreBrani();
        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);
        aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,generi);

        spnGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano();
            }
        });


    }
}

