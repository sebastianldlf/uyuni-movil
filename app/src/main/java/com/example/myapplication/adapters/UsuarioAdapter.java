package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.Usuarios;

import java.util.List;

public class UsuarioAdapter extends ArrayAdapter<Usuarios> {
    private Context context;
    private List<Usuarios> listaUsuarios;

    public UsuarioAdapter(@NonNull Context context, List<Usuarios>listaUsuarios) {
        super(context, 0, listaUsuarios);
        this.context=context;
        this.listaUsuarios=listaUsuarios;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_usuario,parent,false);
        }

        //Obtener usuarios actual

        Usuarios usuarios = listaUsuarios.get(position);

        TextView tvNombre = convertView.findViewById(R.id.tvNombre);
        TextView tvEmail = convertView.findViewById(R.id.tvEmail);

        //Asignar datos
        tvNombre.setText(usuarios.getNombre());
        tvEmail.setText(usuarios.getEmail());




        return super.getView(position, convertView, parent);
    }
}
