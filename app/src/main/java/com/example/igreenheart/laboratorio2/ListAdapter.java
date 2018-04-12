package com.example.igreenheart.laboratorio2;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.igreenheart.laboratorio2.model.Movimiento;

import java.util.ArrayList;




public class ListAdapter extends ArrayAdapter<Movimiento> implements View.OnClickListener{

    private ArrayList<Movimiento> dataSet;
    Context mContext;



    public ListAdapter(ArrayList<Movimiento> data, Context context) {
        super(context, R.layout.list_item, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Movimiento  dataModel=(Movimiento)object;

        switch (v.getId())
        {
            case R.id.listEliminar:

                Snackbar.make(v, "Eliminar  " +dataModel.getDescripcion(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

                break;
        }

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Movimiento dataModel = getItem(position);

        if (convertView == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            convertView = vi.inflate(R.layout.list_item ,null);
        }

        ImageView  categoria= (ImageView) convertView.findViewById(R.id.listCategoria);
        TextView  descripcion= (TextView)convertView.findViewById(R.id.listDescripcion);
        TextView  fecha= (TextView)convertView.findViewById(R.id.listFecha);
        ImageView eliminar =(ImageView)convertView.findViewById(R.id.listEliminar);


        categoria.setImageResource(android.R.drawable.presence_online);
        descripcion.setText(dataModel.getDescripcion());
        fecha.setText(dataModel.getFecha().toString());
        eliminar.setOnClickListener(this);
        eliminar.setTag(position);

        return convertView;
    }
}