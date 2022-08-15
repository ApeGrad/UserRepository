package Lesson8.Test;

import Lesson8.Exceptions.CreateException;
import Lesson8.Model.User;
import Lesson8.Repositorries.UserRepository;

public class RepositoryTest {
    public static void main(String[] args) throws CreateException {
        test2();
    }

    public static void test1() throws CreateException {
        User user1 = new User("test","test");
        UserRepository userRepository =UserRepository.instance();

       userRepository.createUser(user1);
       userRepository.createUser(user1);
    }

    public static void test2() throws CreateException {
        User user1 = new User("test","test");
        User user2 = new User("test", "test");

        UserRepository repository = UserRepository.instance();
        repository.createUser(user1);
        repository.createUser(user2);
    }
}
