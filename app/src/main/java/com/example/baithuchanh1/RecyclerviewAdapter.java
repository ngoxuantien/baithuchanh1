package com.example.baithuchanh1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    private Context context;
    private List<User> list;

    public RecyclerviewAdapter(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recyclerview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.ViewHolder holder, int position) {
        holder.ngaysinh.setText(list.get(position).getDateofbirth());
        holder.id.setText(list.get(position).getId()+"");
        holder.name.setText(list.get(position).getName());
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(position);
            //    notifyItemRemoved(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView id, name, ngaysinh;
        Button xoa;
ImageView imageView ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagedf);
            id = itemView.findViewById(R.id.iduser);
            name = itemView.findViewById(R.id.nametv);
            ngaysinh = itemView.findViewById(R.id.ngaysinh);
            xoa= itemView.findViewById(R.id.xoa);
        }
    }
}
