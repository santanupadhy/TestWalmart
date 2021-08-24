package com.interview.testwalmart.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.interview.testwalmart.Data.Model.ArticlesItem;
import com.interview.testwalmart.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<ArticlesItem> mListFeeds;
    Context mContext;

    public NewsAdapter(Context context) {
        mContext = context;
        // mInflater = LayoutInflater.from(context);
        mListFeeds = new ArrayList<>();

    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news_list, parent, false);
        ViewHolder rcv = new ViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        ArticlesItem articlesItem = mListFeeds.get(position);


        holder.message.setText(articlesItem.getDescription());
        holder.tv_title.setText(articlesItem.getTitle());
    }

    @Override
    public int getItemCount() {
        return 0;
    }


}


