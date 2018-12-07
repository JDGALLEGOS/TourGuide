package com.galpotechsolutions.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     *
     * @param context The current context. Used to inflate the layout file
     * @param details A list of details object to display in a list
     */
    public PlaceAdapter(Activity context, ArrayList<Place> details) {
        super(context,0, details);
    }

    /**
     *
     * @param position    The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate
     * @param parent      The parent viewGroup that is used for inflation.
     * @return            The view for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        // Check if the existing view is being reused, otherwse inflate the view
        View listItemView =convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_message, parent, false);

            // Find the TextView in the fragment_message.xml layout with the ID default_text_view
            viewHolder.placeTextView = listItemView.findViewById(R.id.default_text_view);

            // Find the TextView in the fragment_message.xml layout with the ID city_text_view
            viewHolder.cityTextView = listItemView.findViewById(R.id.city_text_view);

            // Find the TextView in the fragment_message.xml layout with the ID list_item_icon
            viewHolder.iconView = listItemView.findViewById(R.id.list_item_icon);

            //Set the tag of the ViewHolder
            listItemView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) listItemView.getTag();
        }

        //get the {@link Detail} object located at this position in the list
        Place currentDetail = getItem(position);

        // Get the name of the place from the current place object and set this text to the Place defaultTranslations
        viewHolder.placeTextView.setText(currentDetail.getDefaultTranslation());

        // Get the name of the city from the current place object and set this text to the Place city
        viewHolder.cityTextView.setText(currentDetail.getCity());

        // Get the image of the place from the current place object and set this image to the Detail imageResourceIds
        viewHolder.iconView.setImageResource(currentDetail.getImageResourceIds());

        return listItemView;
    }

    static class ViewHolder {
        TextView placeTextView;
        TextView cityTextView;
        ImageView iconView;
    }
}
