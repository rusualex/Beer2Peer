package ala.beer2peer.services;

import java.util.List;

import ala.beer2peer.model.Event;
import ala.beer2peer.repo.UnitOfWork;

public class EventService {
    private UnitOfWork unitOfWork;
    public EventService(UnitOfWork unitOfWork){
        this.unitOfWork = unitOfWork;
    }
    public void AddEvent(Event event){
        unitOfWork.getEventRepo().insertEvent(event);
    }
    public void DeleteEvent(int id){
        unitOfWork.getEventRepo().deleteEvent(id);
    }
    public List<Event> GetAllEvents(){
        return unitOfWork.getEventRepo().getEvents();
    }
    public Event GetEvent(int id){
        return unitOfWork.getEventRepo().getEventById(id);
    }
    public void Updateevent(int id, Event event){
        unitOfWork.getEventRepo().updateEvent(id, event);
    }


}
