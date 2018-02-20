package com.example.kanavrampal.livestockmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by kanavrampal on 20-02-2018.
 */

public class MainActivityCustomAdapter extends ArrayAdapter<LiveStockClass> {
    ArrayList<LiveStockClass> mData;
    Context context;
    public MainActivityCustomAdapter(Context context,ArrayList<LiveStockClass> obj)
    {
        super(context,0,obj);
        mData=obj;
        this.context=context;
    }
    @Override
    public int getCount() {
        return mData.size();
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View  v = LayoutInflater.from(this.context).inflate(R.layout.listview_element, parent, false);

        LiveStockClass currentLiveStock=mData.get(position);


        return v;
    }
}
