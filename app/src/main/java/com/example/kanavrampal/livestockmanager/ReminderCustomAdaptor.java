package com.example.kanavrampal.livestockmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by kanavrampal on 20-02-2018.
 */

public class ReminderCustomAdaptor extends ArrayAdapter<String> {
    ArrayList<String> mData;
    Context context;
    public ReminderCustomAdaptor(Context context,ArrayList<String> obj)
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

        View  v = LayoutInflater.from(this.context).inflate(R.layout.listview_element2, parent, false);

        String currentLiveStock=mData.get(position);


        return v;
    }
}
