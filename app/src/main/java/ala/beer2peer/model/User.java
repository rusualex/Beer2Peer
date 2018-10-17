

package ala.beer2peer.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private String[] interests;
    private String profilPicture;
    private double rating;

    public User(int id, String name, String password, int age,
                String[] interests, String profilPicture, double rating,
                String description) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.interests = interests;
        this.profilPicture = profilPicture;
        this.rating = rating;
        this.description = description;
        this.createdEvents = new ArrayList<>();
        this.joinedEvents =  new ArrayList<>();
    }

    private String description;
    private List<Event> createdEvents;
    private List<Event> joinedEvents;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public String getProfilPicture() {
        return profilPicture;
    }

    public void setProfilPicture(String profilPicture) {
        this.profilPicture = profilPicture;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Event> getCreatedEvents() {
        return createdEvents;
    }

    public void setCreatedEvents(List<Event> createdEvents) {
        this.createdEvents = createdEvents;
    }

    public List<Event> getJoinedEvents() {
        return joinedEvents;
    }

    public void setJoinedEvevts(List<Event> joinedEvents) {
        this.joinedEvents = joinedEvents;
    }
}
