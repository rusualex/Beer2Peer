package ala.beer2peer.repo;

import ala.beer2peer.model.Event;
import ala.beer2peer.model.User;
import ala.beer2peer.repo_interface.EventRepoInterface;
import ala.beer2peer.repo_interface.UserRepoInterface;

public class UnitOfWork {
    private UserRepoInterface userRepo;
    private EventRepoInterface eventRepo;

    public UnitOfWork(){
        userRepo = new UserRepo();
        eventRepo = new EventRepo();
        populate();
    }
    public void populate(){
        User user = new User("alex@yahoo.com", "Alex","mypassAlex",20,new String[]{"Bier","Wine"},"empty");
        User user2 = new User("laura@yahoo.de", "Laura","mypassLaura",21,new String[]{"Wine"},"empty");
        User user3 = new User("geo@yahoo.com", "RusuAlexGeo","geoPass",50,new String[]{"Wine","Bier"},"empty");

        Event event = new Event("Klausenburger", "Downtown", "essen", "20.10.2018", user,user2);
        Event event2 = new Event("Revolution", "Downtown", "club", "21.10.2018", user2,user3);
        Event event3 = new Event("Euphoria", "Downtown", "club", "19.10.2018", user,user2);

    userRepo.insertUser(user);
    userRepo.insertUser(user2);
    userRepo.insertUser(user3);

    eventRepo.insertEvent(event);
    eventRepo.insertEvent(event2);
    eventRepo.insertEvent(event3);



    }

    public UserRepoInterface getUserRepo() {
        return userRepo;
    }

    public void setUserRepo(UserRepoInterface userRepo) {
        this.userRepo = userRepo;
    }

    public EventRepoInterface getEventRepo() {
        return eventRepo;
    }

    public void setEventRepo(EventRepoInterface eventRepo) {
        this.eventRepo = eventRepo;
    }
}
