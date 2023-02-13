package it.develhope.noSqlOrm1.repositories;

import it.develhope.noSqlOrm1.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Drumstyle92
 * Repository interface to better manage access to application data
 */
public interface UserRepository extends MongoRepository<User, String> {

}
