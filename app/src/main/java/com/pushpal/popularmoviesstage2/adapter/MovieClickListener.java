package com.pushpal.popularmoviesstage2.adapter;

import android.widget.ImageView;

import com.pushpal.popularmoviesstage2.model.Movie;

public interface MovieClickListener {
    void onMovieClick(int pos, Movie movie, ImageView shareImageView);
}