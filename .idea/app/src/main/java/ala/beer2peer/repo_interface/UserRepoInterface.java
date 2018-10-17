package ala.beer2peer.repo_interface;

import java.util.List;

import ala.beer2peer.model.User;

public interface UserRepoInterface {
    public List<User> getUsers();
    public User getUserById(int id);
    public void insertUser(User user);
    public void deleteUser(int id);
    public void updateEvent(int id, User user);

}
