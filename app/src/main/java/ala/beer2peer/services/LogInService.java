package ala.beer2peer.services;

import ala.beer2peer.model.User;
import ala.beer2peer.repo.UnitOfWork;
import ala.beer2peer.repo.UserRepo;
import ala.beer2peer.repo_interface.UserRepoInterface;

public class LogInService {
    private UnitOfWork unitOfWork;
    public LogInService(UnitOfWork unitOfWork){
        this.unitOfWork = unitOfWork;
    }

    public User logIn(String email, String password){
        for(User user : unitOfWork.getUserRepo().getUsers()){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)) return user;
        }
        return null;
    }
}
