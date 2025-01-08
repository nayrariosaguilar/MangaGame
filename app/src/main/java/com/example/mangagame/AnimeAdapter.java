package com.example.mangagame;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {
    private List<Anime> items;
    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;


       //mete dentro del array los valores adecuados
        public AnimeViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            visitas = (TextView) v.findViewById(R.id.visitas);
        }
    }
    //la utiliza en el main
    public AnimeAdapter(List<Anime> items) {
        this.items = items;
    }
    //el total de items que hay en la lista del Main
    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        //instanciamos el layout que queremos implementar
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.anime_row, viewGroup, false);
        return new AnimeViewHolder(v);
    }

    //
    @Override
    public void onBindViewHolder(AnimeViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.visitas.setText("Visitas:"+String.valueOf(items.get(i).getVisitas()));
    }
}