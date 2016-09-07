package com.example.manish.demoproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Manish on 5/13/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    List<ContectInfo> lists;

    public MyAdapter(List<ContectInfo> lists) {
        this.lists=lists;
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        protected TextView vName;
        protected TextView vSurname;
        protected TextView vEmail;
        protected TextView vTitle;

        public MyHolder(View v) {
                       super(v);

            vName =  (TextView) v.findViewById(R.id.txtName);
            vSurname = (TextView)  v.findViewById(R.id.txtSurname);
            vEmail = (TextView)  v.findViewById(R.id.txtEmail);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);

        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        ContectInfo ci=lists.get(position);
        holder.vName.setText(ci.name);
        holder.vSurname.setText(ci.surname);
        holder.vEmail.setText(ci.email);
        holder.vTitle.setText(ci.name + " " + ci.surname);

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }
}
