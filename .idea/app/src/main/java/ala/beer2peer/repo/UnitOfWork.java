package ala.beer2peer.repo;

import ala.beer2peer.repo_interface.EventRepoInterface;
import ala.beer2peer.repo_interface.UserRepoInterface;

public class UnitOfWork {
    private UserRepoInterface userRepo;
    private EventRepoInterface eventRepo;

    public UnitOfWork(){
        userRepo = new UserRepo();
        eventRepo = new EventRepo();
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
