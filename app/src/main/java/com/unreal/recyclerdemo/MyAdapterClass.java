package com.unreal.recyclerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapterClass extends RecyclerView.Adapter<MyAdapterClass.ViewHolder>{

    String data1[], data2[];
    int images[];
    Context context;
    public MyAdapterClass(Context ct, String s1[], String s2[], int img[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_rows, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView text1, text2;
        ImageView myImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.book_name);
            text2 = itemView.findViewById(R.id.book_description);
            myImage = itemView.findViewById(R.id.image);
        }
    }
}
