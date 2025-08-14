package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.adapters.UsuarioAdapter;

import java.util.ArrayList;

public class LIstActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        ListView listViewUsuarios;
        TextView tvMenuPrincipal;
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        boolean carlos = usuarios.add(new Usuarios("Carlos","ramirez","123","carlos@gmail.com","12345"));
        usuarios.add(new Usuarios("Karla","diaz","1234","karla@gmail.com","1234567"));
        usuarios.add(new Usuarios("Marta","godinez","12","martita@gmail.com","345"));


        //vincular cuentas
        listViewUsuarios=findViewById(R.id.list_view);
        tvMenuPrincipal = findViewById(R.id.tvMenuPrincipal);

        //configurar adaptador personalizado

        UsuarioAdapter adapter =new UsuarioAdapter(this, usuarios);
        listViewUsuarios.setAdapter(adapter);

        //evento para volver al menu principal

        tvMenuPrincipal.setOnClickListener(new Vi)


    }

}