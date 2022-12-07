package edu.byu.cs.tweeter.server.dao.factory;

import edu.byu.cs.tweeter.model.domain.AuthToken;
import edu.byu.cs.tweeter.model.domain.Follow;
import edu.byu.cs.tweeter.model.domain.Status;
import edu.byu.cs.tweeter.model.domain.User;
import edu.byu.cs.tweeter.server.dao.Database;
import edu.byu.cs.tweeter.server.dao.PagedDatabase;

public interface DAOFactory {
    Database<AuthToken> getAuthTokenDAO();
    Database<User> getUsersDAO();
    PagedDatabase<Follow, User> getFollowDAO();
    Database<Status> getFeedDAO();
    Database<Status> getStoryDAO();
}
