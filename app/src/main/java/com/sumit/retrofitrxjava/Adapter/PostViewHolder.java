package com.sumit.retrofitrxjava.Adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sumit.retrofitrxjava.R;

public class PostViewHolder extends RecyclerView.ViewHolder {

    TextView name, email_id, contact_number;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        name = (TextView)itemView.findViewById(R.id.name);
        email_id = (TextView)itemView.findViewById(R.id.email_id);
        contact_number = (TextView)itemView.findViewById(R.id.contact_number);
    }
}
