package com.example.igreenheart.laboratorio2.balancefinancieroguia;


import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.igreenheart.laboratorio2.ListAdapter;
import com.example.igreenheart.laboratorio2.R;
import com.example.igreenheart.laboratorio2.model.Categoria;
import com.example.igreenheart.laboratorio2.model.Movimiento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovimientoActivity extends AppCompatActivity {
    ListActivity la = new ListActivity();
    final ArrayList dataModels= new ArrayList<Movimiento>();
    private RadioGroup grupoMovimientos;
    private Spinner spMov;
    EditText etDesc, etDate;
    Button btnGuardar;
    int radioSeleccionado;

    List<Categoria> categorias =  new ArrayList<Categoria>();
    List<String> aux = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        aux.add("Seleccione un tipo movimiento");

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movimiento);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, aux);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.movimiento);
        sItems.setAdapter(adapter);



        grupoMovimientos = (RadioGroup)findViewById(R.id.radioGroup);
        spMov = (Spinner)findViewById(R.id.movimiento);
        etDesc = (EditText)findViewById(R.id.descripcion);
        etDate = (EditText)findViewById(R.id.fecha);
        String descrSelec = spMov.getSelectedItem().toString();

        grupoMovimientos.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int flag1 = 0;
                int flag2 = 1;
                radioSeleccionado = grupoMovimientos.indexOfChild(findViewById(checkedId));
                ArrayAdapter<Categoria> adapter1 = new ArrayAdapter<Categoria>(getApplicationContext(), android.R.layout.simple_spinner_item, categorias);

                switch (radioSeleccionado) {

                    case 0:
                        categorias.clear();
                        categorias.add(new Categoria(1,0,"Salario"));
                        categorias.add(new Categoria(2,0,"Alquiler"));

                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spMov.setAdapter(adapter1);

                        break;

                    case 1:
                        categorias.clear();
                        categorias.add(new Categoria(3,1,"Alimentos"));
                        categorias.add(new Categoria(4,1,"Diversión"));

                        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        spMov.setAdapter(adapter1);

                        break;

                    default:
                        break;

                }
            }

        });}




    public void movimientos() {

    }
}