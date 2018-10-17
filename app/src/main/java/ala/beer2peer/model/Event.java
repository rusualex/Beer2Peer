package ala.beer2peer.model;

public class Event {
    private static int id;
    private String name;
    private String locationURL;
    private String type;
    private String date;
    private User organizer;
    private User buddy;

    public Event(String name, String locationURL, String type, String date, User organizer, User buddy) {
        id++;
        this.name = name;
        this.locationURL = locationURL;
        this.type = type;
        this.date = date;
        this.organizer = organizer;
        this.buddy = buddy;
    }





    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationURL() {
        return locationURL;
    }

    public void setLocationURL(String locationURL) {
        this.locationURL = locationURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getOrganizer() {
        return organizer;
    }

    public void setOrganizer(User organizer) {
        this.organizer = organizer;
    }

    public User getBuddy() {
        return buddy;
    }

    public void setBuddy(User buddy) {
        this.buddy = buddy;
    }

}
