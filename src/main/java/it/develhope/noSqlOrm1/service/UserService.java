package it.develhope.noSqlOrm1.service;

import it.develhope.noSqlOrm1.entities.User;
import it.develhope.noSqlOrm1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * @author Drumstyle92
 * Service class with business logic to better manage and separate data, data reading and their representation
 */
@Service
public class UserService {

    /**
     * Instance of the UserRepository class with automatic injection
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * @param userRepository
     * Constructor of the class to which it belongs
     */
    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public UserRepository getUserRepository() {

        return userRepository;
    }

    /**
     * @param userRepository
     * Method for encapsulation
     */
    public void setUserRepository(UserRepository userRepository) {

        this.userRepository = userRepository;

    }

    /**
     * @param user Parameter user where the created user goes
     * @return Returns a created user
     * Method that returns the creation of a user from the repository
     */
    public User createUser(User user){

        return userRepository.save(user);
    }

    /**
     * @return Returns the list of users
     * Method that retrieves the list of users from the repository
     */
    public List<User> getUserAll(){

        return userRepository.findAll();
    }

    /**
     * @param id Id parameter that can be changed
     * @return returns the user with the selected id from the repository
     * Method that calls a user through the repository
     */
    public Optional<User> getUserId(String id){

        return userRepository.findById(id);
    }

    /**
     * @param user User parameter that can be changed
     * @return Return the modified user from the repository
     * Method that retrieves the user's update from the repository
     */
    public User editUser(User user ){

        return userRepository.save(user);

    }

    /**
     * @param id id parameter that can be changed
     * Method that deletes a user from the repository
     */
    public void deleteUser(String id){

        userRepository.deleteById(id);
    }

}
