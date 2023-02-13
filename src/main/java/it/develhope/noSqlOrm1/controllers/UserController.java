package it.develhope.noSqlOrm1.controllers;

import it.develhope.noSqlOrm1.entities.User;
import it.develhope.noSqlOrm1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/**
 * @author Drumstyle92
 * Controller class for making and receiving HTTP requests
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * Instance of the UserService class with automatic injection
     */
    @Autowired
    private UserService userService;

    /**
     * @param user User parameter to be able to create the body in API requests
     * @return Returns the created body
     * Post method to create API request user
     */
    @PostMapping
    public User createUser(@RequestBody User user){

        return userService.createUser(user);

    }

    /**
     * @return Returns the entire list of users in the API request
     * Get method which is used to display all users in the API request
     */
    @GetMapping
    public List<User> getUserAll(){

        return userService.getUserAll();

    }

    /**
     * @param id Url id parameter that can be changed
     * @return Returns via the id chosen a user in the API request
     * Get method that returns only one user of the API request
     */
    @GetMapping("/{id}")
    public Optional<User> getUserId(@PathVariable String id){

        return userService.getUserId(id);

    }

    /**
     * @param id id parameter that allows you to change it in the url
     * @param user User parameter that allows you to modify the body in the API request with the chosen id
     * @return Returns the user with the changes made in the API request
     * Put method that allows you to change the characteristics of a user and save them with the API request
     */
    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user ){

        user.setId(id);
        return userService.editUser(user);

    }

    /**
     * @param id Id parameter that chosen in the url deletes the associated user
     * Delete method for deleting a user in the API request
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){

        userService.deleteUser(id);

    }

}
