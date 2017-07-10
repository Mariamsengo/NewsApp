package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by MariamNKinene on 06/07/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    // Tag for the log messages
    private static final String LOG_TAG = NewsLoader.class.getName();

    // Query Url
    private String mUrl;

    /**
     * Constructs a new {@link NewsLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        // Call the fetchNewsData method from QueryUtils and return the list of news articles
        List<News> news = QueryUtils.fetchNewsData(mUrl, getContext());
        return news;

    }
}
