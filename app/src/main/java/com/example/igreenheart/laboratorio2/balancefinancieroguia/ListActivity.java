package com.example.igreenheart.laboratorio2.balancefinancieroguia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.igreenheart.laboratorio2.ListAdapter;
import com.example.igreenheart.laboratorio2.R;
import com.example.igreenheart.laboratorio2.model.Categoria;
import com.example.igreenheart.laboratorio2.model.Movimiento;

import java.util.ArrayList;
import java.util.Date;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ListActivity.this, MovimientoActivity.class);
                startActivity(intent);

            }
        });
        ListView listView=(ListView)findViewById(R.id.list);

        final ArrayList dataModels= new ArrayList<Movimiento>();

        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 1",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 2",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 3",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 4",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 5",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 6",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 7",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 8",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 9",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 10",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 11",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 12",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 13",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 14",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 15",new Date(2015,1,1)));
        dataModels.add(new Movimiento(1,new Categoria(1,1,"XXXX"),"Gasto acumulado 16",new Date(2015,1,1)));



        ListAdapter adapter= new ListAdapter(dataModels,getApplicationContext());

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Movimiento dataModel= (Movimiento)dataModels.get(position);

                // Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                //       .setAction("No action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
