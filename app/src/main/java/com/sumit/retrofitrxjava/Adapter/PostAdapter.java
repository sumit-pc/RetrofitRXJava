package com.sumit.retrofitrxjava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sumit.retrofitrxjava.Model.Post;
import com.sumit.retrofitrxjava.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    Context  context;
    List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {

        holder.name.setText(String.valueOf(postList.get(position).name));
        holder.contact_number.setText(String.valueOf(postList.get(position).email_id));
        holder.email_id.setText(new StringBuilder(postList.get(position).contact_number));
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
