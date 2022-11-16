package com.example.tg1grupo1.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tg1grupo1.MainActivity;
import com.example.tg1grupo1.R;
import com.example.tg1grupo1.model.Receta;

import java.util.List;

public class RAdapter extends RecyclerView.Adapter<RAdapter.ViewHolder>{

    private List<Receta> recetas;

    public RAdapter(List<Receta> recetas){ this.recetas = recetas; }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_layout, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(recetas.get(position).getTitulo());
        holder.descripcion.setText(String.valueOf(recetas.get(position).getDescripcion()));
        holder.imagen.setImageResource(recetas.get(position).getImagen());
        holder.descripcionLarga.setText(String.valueOf(recetas.get(position).getDescripcionLarga()));
    }

    @Override
    public int getItemCount() {
        return recetas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView titulo;
        public TextView descripcion;
        public TextView descripcionLarga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen = itemView.findViewById(R.id.imgFoto);
            titulo = itemView.findViewById(R.id.txtTitulo);
            descripcion = itemView.findViewById(R.id.txtDescripcion);
            descripcionLarga = itemView.findViewById(R.id.txtDescripcionLarga);
        }
    }

}
