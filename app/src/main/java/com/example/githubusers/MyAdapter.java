package com.example.githubusers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private Context context;
    private User[] data;
    public MyAdapter(Context context, User[] data)
    {
        this.context=context;
        this.data=data;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view =  inflater.inflate(R.layout.userlayout,viewGroup,false);
        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {


        User user = data[i];
        myViewHolder.textView.setText(user.getLogin());
        Glide.with(myViewHolder.imgView.getContext()).load(user.getAvatarUrl()).into(myViewHolder.imgView);




    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{


        ImageView imgView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = (ImageView) itemView.findViewById(R.id.imguser);
            textView = (TextView) itemView.findViewById((R.id.textUser));
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(context, for(int i = 0,data.length,i++)
                    {
                        data[i];
                    }, Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
