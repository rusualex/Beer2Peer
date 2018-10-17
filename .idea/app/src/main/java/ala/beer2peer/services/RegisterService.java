package ala.beer2peer.services;

import ala.beer2peer.model.User;
import ala.beer2peer.repo.UnitOfWork;

public class RegisterService {
    private UnitOfWork unitOfWork;

    public RegisterService(){
        unitOfWork = new UnitOfWork();
    }

    public boolean Register(User user){
       boolean isAlready = false;
       for(User u : unitOfWork.getUserRepo().getUsers()){
           if(u.getName().equals(user.getName()) && u.getPassword().equals(user.getPassword()))
               isAlready = true;
       }
       if(isAlready==true) return false;
       if(isAlready==false) {
           unitOfWork.getUserRepo().getUsers().add(user);
           return true;
       }
    }
}
