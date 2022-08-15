package Controllers;

import Lesson8.Exceptions.NotFoundException;
import Lesson8.Model.User;
import Lesson8.Repositorries.UserRepository;

public class LoginController {
    private static final UserRepository repository = UserRepository.instance();

    public boolean isAuthorisationTrue(String login, String password) {
        try {
            User user = repository.getUserByLogin(login);
            if(user == null){
                System.out.println("Login not found");
                return false;
            }else{
                if(user.getPass().equals(password)){
                    return true;
                }else{
                    System.out.println("Wrong password");
                    return false;
                }
            }

        } catch (NotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}