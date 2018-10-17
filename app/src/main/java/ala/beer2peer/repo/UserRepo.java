package ala.beer2peer.repo;

import java.util.ArrayList;
import java.util.List;

import ala.beer2peer.model.User;
import ala.beer2peer.repo_interface.UserRepoInterface;

public class UserRepo implements UserRepoInterface {

    private List<User> userList;

    public UserRepo(){
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


    @Override
    public List<User> getUsers() {
        return userList;
    }

    @Override
    public User getUserById(int id) {

        for(User user : userList){
            if(user.getId()==id) return user;

        }
        return null;
    }

    @Override
    public void insertUser(User user) {
        userList.add(user);


    }

    @Override
    public void deleteUser(int id) {
        User target = null;
        for(User user : userList){
            if(user.getId()==id) { target = user; break; }
        }
        userList.remove(target);
    }

    @Override
    public void updateEvent(int id, User user) {
        User target = null;
        for(User x : userList){
            if(user.getId()==id) { target = x; break; }
        }
        target = user;
    }
}
