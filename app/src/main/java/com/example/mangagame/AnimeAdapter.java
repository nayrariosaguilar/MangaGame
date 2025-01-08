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

    //instanciamos los campos de mi anime_row,
    //tiene en memoria cada pieza
    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView visitas;


       //mete dentro del array los valores adecuados
        //les abre el findById
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

    //vinculas los elementos con la posicion que estan en la list del main
    @Override
    public void onBindViewHolder(AnimeViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        //de la lista de items obten el que esta en la position
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.visitas.setText("Visitas:"+(items.get(i).getVisitas()));
    }
}