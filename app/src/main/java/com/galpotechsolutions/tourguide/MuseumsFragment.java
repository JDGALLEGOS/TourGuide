package com.galpotechsolutions.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a array of places
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getResources().getString(R.string.museum_maya), getResources().getString(R.string.name_city), R.drawable.museo_maya2));
        places.add(new Place(getResources().getString(R.string.museum_antropologia), getResources().getString(R.string.name_city), R.drawable.museo_antropologia));
        places.add(new Place(getResources().getString(R.string.museum_macay), getResources().getString(R.string.name_city), R.drawable.macay));
        places.add(new Place(getResources().getString(R.string.museum_olimpo), getResources().getString(R.string.name_city), R.drawable.museo_olimpo));

        PlaceAdapter itemAdapter = new PlaceAdapter(getActivity(), places);

        final ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle extra = new Bundle();
                extra.putString("place", places.get(i).getDefaultTranslation());

                Intent appInfo = new Intent(getActivity(), DetailActivity.class);
                appInfo.putExtras(extra);
                startActivity(appInfo);
            }
        });

        return rootView;
    }
}
