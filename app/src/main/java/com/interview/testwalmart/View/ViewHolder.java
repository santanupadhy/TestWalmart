package com.interview.testwalmart.View;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView tv_title,message,source;


    public ViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
    }
}