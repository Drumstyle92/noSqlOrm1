package it.develhope.noSqlOrm1.entities;

import org.springframework.data.annotation.Id;

/**
 * @author Drumstyle92
 * Entity class that contains the variables for the API
 */
public class User {

    /**
     * Id variable representing the API user id
     */
    @Id
    private String id;

    /**
     * API username variable
     */
    private String firstName;

    /**
     * API user surname variable
     */
    private String lastName;

    /**
     * @param id User id parameter
     * @param firstName User name parameter
     * @param lastName User last name parameter
     * Constructor of the class to which it belongs
     */
    public User(String id, String firstName, String lastName) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getId() {

        return id;

    }

    /**
     * @param id
     * Method for encapsulation
     */
    public void setId(String id) {

        this.id = id;

    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getFirstName() {

        return firstName;

    }

    /**
     * @param firstName
     * Method for encapsulation
     */
    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getLastName() {

        return this.lastName;

    }

    /**
     * @param lastName
     * Method for encapsulation
     */
    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

}
