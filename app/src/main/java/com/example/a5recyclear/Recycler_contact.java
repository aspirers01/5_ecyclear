package com.example.a5recyclear;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler_contact extends RecyclerView.Adapter<Recycler_contact.ViewHolder> {
    Context context;
    ArrayList<Contact_model>arrcnt;
    Recycler_contact(Context context,ArrayList<Contact_model>arrcnt){
        this.context=context;
        this.arrcnt=arrcnt;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(context).inflate(R.layout.roll_view,parent,false);
        ViewHolder viewHolder;
        viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
             holder.txtno.setText(arrcnt.get(position).number);
             holder.txtname.setText(arrcnt.get(position).name);
    }

    @Override
    public int getItemCount() {
        return arrcnt.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
           TextView txtname,txtno;
               public ViewHolder( View itemholder){
                   super(itemholder);

                   txtname=itemholder.findViewById(R.id.txtname);
                   txtno=itemholder.findViewById(R.id.txtno);
               }
    }
}
