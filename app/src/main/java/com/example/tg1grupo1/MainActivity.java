package com.example.tg1grupo1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tg1grupo1.adapter.RAdapter;
import com.example.tg1grupo1.model.Receta;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AlertDialog.Builder receta = new AlertDialog.Builder(this);

        RecyclerView recyclerRecetas = findViewById(R.id.recyclerRecetas);
        recyclerRecetas.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerRecetas.setLayoutManager(layoutManager);

        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta(R.drawable.tortilla, "Tortilla de Patata", "La tortilla de patatas, de papas o tortilla española es una tortilla u omelete", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aper"));
        recetas.add(new Receta(R.drawable.gazpacho,"Gazpacho", "El gazpacho es una sopa fría con varios ingredientes como aceite de oliva, vinagre, agua, hortalizas crudas", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aper"));
        // recetas.add(new Serie(R.drawable.bnha, "Boku no Hero Academia", 2013));
        // recetas.add(new Serie(R.drawable.naruto, "Naruto", 2000));

        recyclerRecetas.setAdapter(new RAdapter(recetas));




    }
}