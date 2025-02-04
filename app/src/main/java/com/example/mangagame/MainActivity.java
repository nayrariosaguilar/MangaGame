package com.example.mangagame;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
  //  private RecyclerView.Adapter adapter;
    private AnimeAdapter adapter;
    private   List items = new ArrayList();
    private RecyclerView.LayoutManager lManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicioListAnimes();
        inicioElementos();
    }
    private void inicioElementos() {

        recycler = (RecyclerView) findViewById(R.id.recyclerView);
        recycler.setHasFixedSize(true);
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
        recycler.setAdapter(adapter);
        adapter = new AnimeAdapter(items);
    }

    private void inicioListAnimes() {
        items.add(new Anime(R.drawable.fate, "Fate Stay Night", 342));
        items.add(new Anime(R.drawable.angelbeats, "Welcome to the NHK", 645));
        items.add(new Anime(R.drawable.deathnote, "Suzumiya Haruhi", 459));
        items.add(new Anime(R.drawable.fate, "Fate Stay Night", 342));
        items.add(new Anime(R.drawable.angelbeats, "Welcome to the NHK", 645));
        items.add(new Anime(R.drawable.deathnote, "Suzumiya Haruhi", 459));
        items.add(new Anime(R.drawable.fate, "Fate Stay Night", 342));
        items.add(new Anime(R.drawable.angelbeats, "Welcome to the NHK", 645));
        items.add(new Anime(R.drawable.deathnote, "Suzumiya Haruhi", 459));
        items.add(new Anime(R.drawable.fate, "Fate Stay Night", 342));
        items.add(new Anime(R.drawable.angelbeats, "Welcome to the NHK", 645));
        items.add(new Anime(R.drawable.deathnote, "Suzumiya Haruhi", 459));

    }
}