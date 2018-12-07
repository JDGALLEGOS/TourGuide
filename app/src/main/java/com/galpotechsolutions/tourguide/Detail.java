package com.galpotechsolutions.tourguide;

public class Detail {
    /** Name of the plae */
    private String placeNames;
    /** Description of the place */
    private String shortDescriptions;
    /** Working Hours of the place */
    private String workingHours;
    /** Contact Phone Number of the place */
    private String contactNumbers;
    /** Website of the place */
    private String webSites;

    /** Drawable resource ID */
    private int imageResourceIds = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @param placeName is the name of the place (museum, restaurant, shopping or activities)
     * @param shortDescription is the description of the place (museum, restaurant, shopping or activities)
     * @param workingHour is the working hours of the place (museum, restaurant, shopping or activities)
     * @param contactNumber is the contact phone number of the place (museum, restaurant, shopping or activities)
     * @param imageResourceId is the drawable resourse ID for the image associated to the place.
     */
    public Detail(String placeName, String shortDescription, String workingHour, String contactNumber, String webSite, int imageResourceId) {
        placeNames = placeName;
        shortDescriptions = shortDescription;
        workingHours = workingHour;
        contactNumbers = contactNumber;
        webSites = webSite;
        imageResourceIds = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getPlaceName(){
        return placeNames;
    }

    /**
     * Get the description of the place.
     */
    public String getShortDescription(){
        return shortDescriptions;
    }

    /**
     * Get the working hours of the place
     */
    public String getWorkingHour(){ return workingHours;}

    /**
     * Get the contact phone number of the place
     */
    public String getContactNumber(){return contactNumbers;}

    /**
     * Get the contact phone number of the place
     */
    public String getWebSite(){return webSites;}

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
