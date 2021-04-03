package com.example.baithuchanh1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerviewAdapter recyclerviewAdapter;
    RecyclerView recyclerView;
    List<User> list;
    EditText iddd,namemm,ngay;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        list.add(new User(1, "hoa", "trang nguyen"));
setUpdate();

        setAdapterrecy();


    }

    public void setAdapterrecy() {
        recyclerView = findViewById(R.id.recyclerviewlayout);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerviewAdapter = new RecyclerviewAdapter(this, list);
        recyclerView.setAdapter(recyclerviewAdapter);


    }
    public void setUpdate(){
        update=findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iddd=findViewById(R.id.idddd);
                namemm=findViewById(R.id.namenn);
                ngay=findViewById(R.id.ngay);

                list.add(new User(Integer.parseInt(iddd.getText().toString()),namemm.getText().toString(),ngay.getText().toString()));
                recyclerviewAdapter.notifyDataSetChanged();

         //      recyclerviewAdapter.notifyItemInserted(0);
              //
            }
        });


    }


}