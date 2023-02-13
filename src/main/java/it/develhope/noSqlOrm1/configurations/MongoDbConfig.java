package it.develhope.noSqlOrm1.configurations;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Drumstyle92
 * Class that allows you to connect to the MondoDb non-relational database
 */
@Configuration
public class MongoDbConfig extends AbstractMongoClientConfiguration {

    /**
     * @return Returns the name of the chosen database
     * Overraid method to be able to put the database name
     */
    @Override
    protected String getDatabaseName() {

        return "develhope";

    }

    /**
     * @return Returns the complete setting of the database
     * Method that connects the database to the application
     */
     public MongoClient mongoClient(){

         ConnectionString connectionString =
                 new ConnectionString("mongodb+srv://Test:Dino1992@cluster0.qdahfw9.mongodb.net/test");
         MongoClientSettings mongoClientSettings =
                 MongoClientSettings.builder().applyConnectionString(connectionString).build();
         return MongoClients.create(mongoClientSettings);

     }

    /**
     * @return Returns the prefix entered
     * Overraised method that scans for the entered prefix and finds all methods mapped to the url
     */
    @Override
    protected Collection<String> getMappingBasePackages() {

        return Collections.singleton("it.develhope");

    }

}
