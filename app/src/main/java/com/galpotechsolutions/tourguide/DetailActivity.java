package com.galpotechsolutions.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.place_list);

        final String placeName = getIntent().getStringExtra("place");

        //Create a array of details
        ArrayList<Detail> details = new ArrayList<>();
        if (placeName.equals(getResources().getString(R.string.museum_maya))) {
            details.add(new Detail(placeName, getResources().getString(R.string.museum_maya_description), getResources().getString(R.string.museum_maya_hour), getResources().getString(R.string.museum_maya_phone), getResources().getString(R.string.museum_maya_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.museum_antropologia))) {
            details.add(new Detail(placeName, getResources().getString(R.string.museum_antropologia_description), getResources().getString(R.string.museum_antropologia_hour), getResources().getString(R.string.museum_antropologia_phone), getResources().getString(R.string.museum_antropologia_website), R.drawable.museo_antropologia_detail));
        }else if (placeName.equals(getResources().getString(R.string.museum_macay))) {
            details.add(new Detail(placeName, getResources().getString(R.string.museum_macay_description), getResources().getString(R.string.museum_macay_hour), getResources().getString(R.string.museum_macay_phone), getResources().getString(R.string.museum_macay_website), R.drawable.museo_macay_detail));
        }else if (placeName.equals(getResources().getString(R.string.museum_olimpo))) {
            details.add(new Detail(placeName, getResources().getString(R.string.museum_olimpo_description ), getResources().getString(R.string.museum_olimpo_hour), getResources().getString(R.string.museum_olimpo_phone), getResources().getString(R.string.museum_olimpo_website), R.drawable.museo_olimpo_detail));
        }else if (placeName.equals(getResources().getString(R.string.restaurant_manjar))) {
            details.add(new Detail(placeName, getResources().getString(R.string.restaurant_manjar_description ), getResources().getString(R.string.restaurant_manjar_hour), getResources().getString(R.string.restaurant_manjar_phone), getResources().getString(R.string.restaurant_manjar_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.restaurant_teya))) {
            details.add(new Detail(placeName, getResources().getString(R.string.restaurant_teya_description ), getResources().getString(R.string.restaurant_teya_hour), getResources().getString(R.string.restaurant_teya_phone), getResources().getString(R.string.restaurant_teya_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.restaurant_wayane))) {
            details.add(new Detail(placeName, getResources().getString(R.string.restaurant_wayane_description ), getResources().getString(R.string.restaurant_wayane_hour), getResources().getString(R.string.restaurant_wayane_phone), getResources().getString(R.string.restaurant_wayane_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.restaurant_chaya))) {
            details.add(new Detail(placeName, getResources().getString(R.string.restaurant_chaya_description ), getResources().getString(R.string.restaurant_chaya_hour), getResources().getString(R.string.restaurant_chaya_phone), getResources().getString(R.string.restaurant_chaya_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.shopping_isla))) {
            details.add(new Detail(placeName, getResources().getString(R.string.shopping_isla_description ), getResources().getString(R.string.shopping_isla_hour), getResources().getString(R.string.shopping_isla_phone), getResources().getString(R.string.shopping_isla_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.shopping_altabrisa))) {
            details.add(new Detail(placeName, getResources().getString(R.string.shopping_altabrisa_description ), getResources().getString(R.string.shopping_altabrisa_hour), getResources().getString(R.string.shopping_altabrisa_phone), getResources().getString(R.string.shopping_altabrisa_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.shopping_harbor))) {
            details.add(new Detail(placeName, getResources().getString(R.string.shopping_harbor_description ), getResources().getString(R.string.shopping_harbor_hour), getResources().getString(R.string.shopping_harbor_phone), getResources().getString(R.string.shopping_harbor_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.shopping_galerias))) {
            details.add(new Detail(placeName, getResources().getString(R.string.shopping_galerias_description ), getResources().getString(R.string.shopping_galerias_hour), getResources().getString(R.string.shopping_galerias_phone), getResources().getString(R.string.shopping_galerias_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.activities_cuzama))) {
            details.add(new Detail(placeName, getResources().getString(R.string.activities_cuzama_description ), getResources().getString(R.string.activities_cuzama_hour), getResources().getString(R.string.activities_cuzama_phone), getResources().getString(R.string.activities_cuzama_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.activities_chichenitza))) {
            details.add(new Detail(placeName, getResources().getString(R.string.activities_chichenitza_description ), getResources().getString(R.string.activities_chichenitza_hour), getResources().getString(R.string.activities_chichenitza_phone), getResources().getString(R.string.activities_chichenitza_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.activities_celestun))) {
            details.add(new Detail(placeName, getResources().getString(R.string.activities_celestun_description ), getResources().getString(R.string.activities_celestun_hour), getResources().getString(R.string.activities_celestun_phone), getResources().getString(R.string.activities_celestun_website), R.drawable.muse_maya_detail));
        }else if (placeName.equals(getResources().getString(R.string.activities_bicirutas))) {
            details.add(new Detail(placeName, getResources().getString(R.string.activities_bicirutas_description ), getResources().getString(R.string.activities_bicirutas_hour), getResources().getString(R.string.activities_bicirutas_phone), getResources().getString(R.string.activities_bicirutas_website), R.drawable.muse_maya_detail));
        }

        //Create the detailAdapter
        DetailAdapter itemAdapter = new DetailAdapter(this, details);
        //Find the ListView
        final ListView listView = findViewById(R.id.list);
        //Set the Adapter  using the adapter
        listView.setAdapter(itemAdapter);

    }
}
