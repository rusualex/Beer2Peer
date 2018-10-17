package ala.beer2peer.repo_interface;

import java.util.List;

import ala.beer2peer.model.Event;


public interface EventRepoInterface {
    public List<Event> getEvents();
    public Event getEventById(int id);
    public void insertEvent(Event event);
    public void deleteEvent(int id);
    public void updateEvent(int id, Event event);
}
