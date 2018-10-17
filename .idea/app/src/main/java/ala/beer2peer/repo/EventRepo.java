package ala.beer2peer.repo;

import java.util.ArrayList;
import java.util.List;

import ala.beer2peer.model.Event;
import ala.beer2peer.repo_interface.EventRepoInterface;

public class EventRepo implements EventRepoInterface {

    private List<Event> eventList;


    public EventRepo(){
        eventList = new ArrayList<>();
    }

    public List<Event> getEventList() {
        return eventList;
    }


    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }




    @Override
    public List<Event> getEvents() {
        return eventList;
    }

    @Override
    public Event getEventById(int id) {

        for(Event event : eventList){
            if(event.getId()==id){
                return event;
            }
        }
        return null;
    }

    @Override
    public void insertEvent(Event event) {
        eventList.add(event);
    }

    @Override
    public void deleteEvent(int id) {
        Event target = null;
        for(Event event : eventList){
            if(event.getId()==id){
                target = event;
                break;
            }
        }
        eventList.remove(target);
    }

    @Override
    public void updateEvent(int id, Event event) {
        Event target = null;
        for(Event x : eventList){
            if(event.getId()==id){
                target = x;
                break;
            }
        }
        target = event;
    }
}
