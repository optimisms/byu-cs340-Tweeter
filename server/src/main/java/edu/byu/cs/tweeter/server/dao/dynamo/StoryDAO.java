package edu.byu.cs.tweeter.server.dao.dynamo;

import edu.byu.cs.tweeter.model.domain.Status;
import edu.byu.cs.tweeter.server.dao.DataAccessException;
import edu.byu.cs.tweeter.server.dao.Database;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;

public class StoryDAO implements Database<Status> {
    private final DynamoDbEnhancedClient enhancedClient;

    public StoryDAO(DynamoDbEnhancedClient enhancedClient) {
        this.enhancedClient = enhancedClient;
    }

    //TODO: implement

    @Override
    public Status get(String partition) {
        return null;
    }

    @Override
    public Status get(String partition, String sort) throws DataAccessException {
        return null;
    }

    @Override
    public void add(Status toAdd) {

    }

    @Override
    public void update(Status toUpdate) {

    }

    @Override
    public void delete(Status toDelete) {

    }
}
