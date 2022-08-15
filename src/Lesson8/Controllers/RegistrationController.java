package Lesson8.Controllers;

import Lesson8.Exceptions.CreateException;
import Lesson8.Exceptions.NotFoundException;
import Lesson8.Exceptions.RegistrationException;
import Lesson8.Model.User;
import Lesson8.Repositorries.UserRepository;

public class RegistrationController {
    private final UserRepository repository = UserRepository.instance();
    private boolean isPasswordsValid(String password1, String password2){
        return password1.equals(password2);
    }
    private boolean isLoginValid(String login){
        try {
            repository.getUserByLogin(login);
            return false;
        } catch (NotFoundException e){
            return true;
        }


    }
    public User register(String login, String password, String repeatedPassword) throws RegistrationException {
        if (isLoginValid(login)) {
            if (isPasswordsValid(password, repeatedPassword)) {
                User user = new User(login, password);
                try {
                    repository.createUser(user);
                    return repository.getUserByLogin(login);
                } catch (CreateException | NotFoundException exception) {
                    throw new RuntimeException(exception);
                }
            } else {
                throw new RegistrationException(RegistrationException.MESSAGE_INVALID_PASS);
            }
        } else {
            throw  new RegistrationException(RegistrationException.MESSAGE_INVALID_LOGIN);

        }
    }
}
