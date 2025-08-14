package com.example.myapplication;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class AdaptadorDemo extends ArrayAdapter<Usuarios> {
    public AdaptadorDemo(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
