package com.example.ux32vd.simplifiedcampocadmin.helper;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ux32vd.simplifiedcampocadmin.R;

import java.util.List;

public class LocationList extends ArrayAdapter<Model>{

    private Activity context;
    List<Model> locations;

    public LocationList(Activity context, List<Model> locations) {
        super(context, R.layout.layout_location_list, locations);
        this.context = context;
        this.locations = locations;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_location_list, null, true);

        TextView textViewDeskripsi = (TextView) listViewItem.findViewById(R.id.ReadDeskripsi);
        TextView textViewFoto = (TextView) listViewItem.findViewById(R.id.ReadFoto);
        TextView textViewLokasi = (TextView) listViewItem.findViewById(R.id.ReadLokasi);

        Model location = locations.get(position);
        textViewDeskripsi.setText(location.getDeskripsi());
        textViewFoto.setText(location.getFoto());
        textViewLokasi.setText(location.getLokasi());

        return listViewItem;
    }
}
