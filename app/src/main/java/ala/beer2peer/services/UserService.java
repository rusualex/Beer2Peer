package ala.beer2peer.services;

import java.util.List;

import ala.beer2peer.model.User;
import ala.beer2peer.repo.UnitOfWork;

public class UserService {
    private UnitOfWork unitOfWork;
    public UserService(UnitOfWork unitOfWork){
        this.unitOfWork = unitOfWork;
    }
    public List<User> getAllUsers(){
        return unitOfWork.getUserRepo().getUsers();
    }
    public User getUser(int id){
        return unitOfWork.getUserRepo().getUserById(id);
    }
    public void updateUser(int id, User user){
        unitOfWork.getUserRepo().updateEvent(id,user);
    }
}
