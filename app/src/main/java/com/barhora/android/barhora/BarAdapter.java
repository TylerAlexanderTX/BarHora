package com.barhora.android.barhora;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tyler on 1/28/2016.
 */
public class BarAdapter extends ArrayAdapter<Bar>{

    private List<Bar> bars;


    public BarAdapter(Context context, int resource, List<Bar> objects) {
        super(context, resource, objects);
        bars = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_of_bars, parent, false);
        }

        Bar location = bars.get(position);
        TextView barName = (TextView) convertView.findViewById(R.id.barName);
        barName.setText(location.getName());

        TextView barCity = (TextView) convertView.findViewById(R.id.barCity);
        barCity.setText(location.getCity());

        TextView barHours = (TextView) convertView.findViewById(R.id.barHours);
        barHours.setText(location.getHours());

        return convertView;
    }
}
