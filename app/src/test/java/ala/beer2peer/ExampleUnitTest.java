package ala.beer2peer;

import org.junit.Test;

import ala.beer2peer.model.User;
import ala.beer2peer.repo.UnitOfWork;
import ala.beer2peer.services.LogInService;
import ala.beer2peer.services.RegisterService;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        User user = new User("dasdsad", "dadsad","dasdsada",12,new String[]{"a","b"},"aaaa");
        UnitOfWork uow = new UnitOfWork();
        //uow.getUserRepo().insertUser(user);
        User user2 = new User("dasdsad", "fdgtret","dasdsada",12,new String[]{"a","b"},"aaaa");
        //uow.getUserRepo().insertUser(user2);

        RegisterService rs = new RegisterService(uow);
        assertEquals(rs.Register(user),true);
        assertEquals(rs.Register(user),false);
        assertEquals(rs.Register(user2),true);

        LogInService ls = new LogInService(uow);
        User result = ls.logIn("dasdsad","dasdsada");
        assertEquals(result,user);

        assertEquals(uow.getUserRepo().getUsers().size(),5);

    }
}