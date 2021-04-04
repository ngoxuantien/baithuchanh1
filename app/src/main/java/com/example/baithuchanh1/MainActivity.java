package com.example.baithuchanh1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerviewAdapter recyclerviewAdapter;
    RecyclerView recyclerView;
    List<User> list;
    EditText iddd, namemm, ngay;
    Button update;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        list.add(new User(1, R.drawable.ic_launcher_background, "trang nguyen","hoa"));
        setUpdate();
   // String [] stringArray=getResources().getStringArray(R.array.dsfaf);
    String [] stringArray = getResources().getStringArray(R.array.dsfaf);
        setAdapterrecy();
       spin = (Spinner) findViewById(R.id.spiner);
        //Gán Data source (arr) vào Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,stringArray
                        );


  //      Glide.with(context).load(categoryItems.get(position).getImageUrl()).into(holder.itemImage);
        //phải gọi lệnh này để hiển thị danh sách cho Spinner
 
        adapter.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        //Thiết lập adapter cho Spinner
        spin.setAdapter(adapter);

        //thiết lập sự kiện chọn phần tử cho Spinner
//        spin.setOnItemSelectedListener(new MyProcessEvent());
//    }


    }

    public void setAdapterrecy() {
        recyclerView = findViewById(R.id.recyclerviewlayout);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerviewAdapter = new RecyclerviewAdapter(this, list);
        recyclerView.setAdapter(recyclerviewAdapter);


    }

    public void setUpdate() {
        update = findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iddd = findViewById(R.id.idddd);
                namemm = findViewById(R.id.namenn);
                ngay = findViewById(R.id.ngay);
                User user1= new User(Integer.parseInt(iddd.getText().toString()), namemm.getText().toString(), ngay.getText().toString());


//                spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//
//
//                    }
//                    public void onNothingSelected(AdapterView<?> parent) {
//
//                    }
//                });

                if (spin.getSelectedItem().equals("hoang")){
                    user1.setImage(R.drawable.imageapp);
                }
                list.add(user1);
                recyclerviewAdapter.notifyDataSetChanged();

                //      recyclerviewAdapter.notifyItemInserted(0);
                //
            }
        });


    }


}