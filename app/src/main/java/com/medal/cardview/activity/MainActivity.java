package com.medal.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.medal.cardview.R;
import com.medal.cardview.adapter.PostagemAdapter;
import com.medal.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //definir layout

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //definir adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){

        Postagem p = new Postagem("Adriano Albuquerque", "#tbt Viagem legal!",
                R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Adriano Albuquerque", "#tbt Viagem legal!",
                R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Adriano Albuquerque", "#tbt Viagem legal!",
                R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Adriano Albuquerque", "#tbt Viagem legal!",
                R.drawable.imagem4);
        this.postagens.add(p);
    }
}
