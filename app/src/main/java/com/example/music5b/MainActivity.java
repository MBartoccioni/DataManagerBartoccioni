package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci, btnVisualizza;
    EditText txtTitolo, txtGenere, txtAutore;
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
        btnVisualizza = (Button) findViewById(R.id.btnVisualizza);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        txtGenere = (EditText) findViewById(R.id.txtGenere);
        txtAutore = (EditText) findViewById(R.id.txtAutore);
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);
        aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,generi);

        spnGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(new Brano(txtTitolo.getText().toString(),spnGeneri.getSelectedItem().toString(),txtGenere.getText().toString(),txtAutore.getText().toString()));
            }
        });


    }
}

