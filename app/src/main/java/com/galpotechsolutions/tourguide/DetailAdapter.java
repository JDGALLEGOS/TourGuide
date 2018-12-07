package com.galpotechsolutions.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailAdapter extends ArrayAdapter<Detail> {
    /**
     *
     * @param context The current context. Used to inflate the layout file
     * @param details A list of details object to display in a list
     */
    public DetailAdapter(Activity context, ArrayList<Detail> details) {
        super(context, 0, details);
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

        //check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.detail_items, parent, false);

            //Find the TextView in the detail_items.xml layout with the ID place_name
            viewHolder.placeTextView = listItemView.findViewById(R.id.place_name);

            //Find the TextView in the detail_items.xml layout with the ID place_description
            viewHolder.descriptionTextView = listItemView.findViewById(R.id.place_description);

            //Find the TextView in the detail_items.xml layout with the ID place_hours
            viewHolder.hoursTextView = listItemView.findViewById(R.id.place_hours);

            //Find the TextView in the detail_items.xml layout with the ID place_contact
            viewHolder.contactTextView = listItemView.findViewById(R.id.place_contact);

            //Find the TextView in the detail_items.xml layout with the ID place_website
            viewHolder.websiteTextView = listItemView.findViewById(R.id.place_website);

            //Find the ImageView in the detail_items.xml layout with the ID place_image
            viewHolder.iconView = listItemView.findViewById(R.id.place_image);
        }else {
            viewHolder = (ViewHolder) listItemView.getTag();
        }

        //get the {@link Detail} object located at this position in the list
        Detail currentDetail = getItem(position);

        //Get the name of the place from the current detail object and set this text to the Detail place_name
        viewHolder.placeTextView.setText(currentDetail.getPlaceName());

        //Get the description of the place from the current detail object and set this text to the Detail place_description
        viewHolder.descriptionTextView.setText(currentDetail.getShortDescription());

        //Get the working hours of the place from the current detail object and set this text to the Detail place_hours
        viewHolder.hoursTextView.setText(currentDetail.getWorkingHour());

        //Get the contact phone number of the place from the current detail object and set this text to the Detail place_contact
        viewHolder.contactTextView.setText(currentDetail.getContactNumber());

        //Get the website of the place from the current detail object and set this text to the Detail place_website
        viewHolder.websiteTextView.setText(currentDetail.getWebSite());

        //Get the image of the album from the current detail object and set this text to the Detail album_image
        viewHolder.iconView.setImageResource(currentDetail.getImageResourceIds());

        return listItemView;
    }

    static class ViewHolder {
        TextView placeTextView;
        TextView descriptionTextView;
        TextView hoursTextView;
        TextView contactTextView;
        TextView websiteTextView;
        ImageView iconView;
    }
}
