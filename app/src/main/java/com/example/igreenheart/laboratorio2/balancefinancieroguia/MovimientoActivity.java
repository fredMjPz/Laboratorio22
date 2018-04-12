package com.example.igreenheart.laboratorio2.balancefinancieroguia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.igreenheart.laboratorio2.R;
import com.example.igreenheart.laboratorio2.model.Categoria;

import java.util.ArrayList;
import java.util.List;

public class MovimientoActivity extends AppCompatActivity {

    List<Categoria> categorias =  new ArrayList<Categoria>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        categorias.add(new Categoria(1,0,"Salario"));
        categorias.add(new Categoria(2,0,"Alquiler"));
        categorias.add(new Categoria(3,1,"Alimentos"));
        categorias.add(new Categoria(4,1,"Diversión"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimiento);
        ArrayAdapter<Categoria> adapter = new ArrayAdapter<Categoria>(
                this, android.R.layout.simple_spinner_item, categorias);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.movimiento);
        sItems.setAdapter(adapter);
    }
}