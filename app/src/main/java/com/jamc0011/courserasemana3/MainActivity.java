package com.jamc0011.courserasemana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.actionBarMain);
        setSupportActionBar(miActionBar);

        listaPerros = (RecyclerView) findViewById(R.id.recyclerViewMascotas);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaPerros.setLayoutManager(linearLayoutManager);
        inicializarListaDePerros();
        inicializarAdapter();
    }


    public void inicializarListaDePerros(){

        perros = new ArrayList<Perro>();

        perros.add(new Perro("Dina","5", R.drawable.perro1));
        perros.add(new Perro("Diente","4", R.drawable.perro2));
        perros.add(new Perro("Canela","4.5", R.drawable.perro3));
        perros.add(new Perro("Chispa","3", R.drawable.perro4));
        perros.add(new Perro("Luna","4", R.drawable.perro5));
        perros.add(new Perro("Lucky","3", R.drawable.perro6));
        perros.add(new Perro("Juno","3", R.drawable.perro7));
        perros.add(new Perro("Pepe","4.2", R.drawable.perro8));
        perros.add(new Perro("Buzz","4.6", R.drawable.perro9));
        perros.add(new Perro("Sultan","3.9",R.drawable.perro10));

    }

    //Metodo para inicializar el adaptador

    public void inicializarAdapter(){
        PerroAdapter perroAdapter = new PerroAdapter(perros, this);
        listaPerros.setAdapter(perroAdapter);
    }

    public void irFavoritosPerros(View view){
        Intent intent = new Intent(this, FavoritoActivity.class);
        startActivity(intent);
    }
}