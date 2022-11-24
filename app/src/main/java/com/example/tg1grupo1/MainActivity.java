package com.example.tg1grupo1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tg1grupo1.adapter.RAdapter;
import com.example.tg1grupo1.model.Receta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RAdapter.OnNoteListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent splash = new Intent(getApplicationContext(), splash.class);
        startActivity(splash);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        creadorDeContenido();

    }

    //con este for lo que hacemos es automatizar el cargar los datos dentro del reciclerView
    private void creadorDeContenido(){
        ArrayList<Integer> imagenes = insertarImagenes();
        List<Receta> recetas = new ArrayList<>();
        String[] titulo = getResources().getStringArray(R.array.titulo);
        String[] ingredientes = getResources().getStringArray(R.array.ingredientes);
        String[] descripcion = getResources().getStringArray(R.array.descripcionCorta);
        String[] descripcionLarga = getResources().getStringArray(R.array.descripcionLarga);
        for(int i = 0; i<imagenes.size();i++){
            recetas.add(new Receta(imagenes.get(i), titulo[i], ingredientes[i], descripcion[i], descripcionLarga[i]));
        }
        /*
        recetas.add(new Receta(R.drawable.tortilla, "Tortilla de Patata","", "La tortilla de patatas, de papas o tortilla española es una tortilla u omelete", ""));
        recetas.add(new Receta(R.drawable.gazpacho,"Gazpacho", "","El gazpacho es una sopa fría con varios ingredientes como aceite de oliva, vinagre, agua, hortalizas crudas", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aper"));
        */

        RecyclerView recyclerRecetas = findViewById(R.id.recyclerRecetas);
        recyclerRecetas.setHasFixedSize(true);
        recyclerRecetas.setAdapter(new RAdapter(recetas, this));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerRecetas.setLayoutManager(layoutManager);
    }
    private ArrayList<Integer> insertarImagenes(){
        ArrayList<Integer> imagenes = new ArrayList<>();
        imagenes.add(R.drawable.tortillaptata);
        imagenes.add(R.drawable.gazpacho);
        imagenes.add(R.drawable.espaguetis);
        imagenes.add(R.drawable.hamburguesa);
        imagenes.add(R.drawable.ramen);
        imagenes.add(R.drawable.burrito);
        imagenes.add(R.drawable.ternerachina);
        imagenes.add(R.drawable.sandwitch);
        imagenes.add(R.drawable.shusi);
        imagenes.add(R.drawable.arroz);
        imagenes.add(R.drawable.mochi);
        imagenes.add(R.drawable.flan);
        imagenes.add(R.drawable.arrozconleche);
        imagenes.add(R.drawable.crep);
        imagenes.add(R.drawable.helado);
        return imagenes;
    }
    private void alerta(String contenido){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("ALERTA");
        builder.setMessage(contenido);
        builder.show();
    }

    @Override
    public void onNoteClic(int posicion) {
        //metodo en que se va a ejecutar cuando cliquemos en el elemento correspondiente
    }
}