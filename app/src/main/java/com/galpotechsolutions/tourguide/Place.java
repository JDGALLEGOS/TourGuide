package com.galpotechsolutions.tourguide;

public class Place {
    /** Place */
    private String defaultTranslations;
    /** City for the place */
    private String citiesText;

    /** Drawable resource ID */
    private int imageResourceIds = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param imageResourceId is the drawable resourse ID for the image associated to the word.
     */
    public Place(String defaultTranslation, String cityText, int imageResourceId) {
        defaultTranslations = defaultTranslation;
        citiesText = cityText;
        imageResourceIds = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation(){
        return defaultTranslations;
    }

    /**
     * Get the default translation of the word.
     */
    public String getCity(){
        return citiesText;
    }

    /**
     * Get the image of the place
     */
    public int getImageResourceIds(){
        return imageResourceIds;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage(){
        return imageResourceIds != NO_IMAGE_PROVIDED;
    }

}
