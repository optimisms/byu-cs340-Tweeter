package edu.byu.cs.tweeter.client.model.service;

import edu.byu.cs.tweeter.client.backgroundTask.GetStoryTask;
import edu.byu.cs.tweeter.client.presenter.StoryPresenter;
import edu.byu.cs.tweeter.model.domain.Status;

public class StoryService extends Service {
    public void getStory(PagedTaskData<Status> data) {
        GetStoryTask getStoryTask = new GetStoryTask(data.getToken(), data.getUser(), data.getPageSize(), data.getLastItem(), new GetStoryHandler(data.getObserver()));
        executeTask(getStoryTask);
    }

    /**
     * Message handler (i.e., observer) for GetStoryTask.
     */
    private class GetStoryHandler extends PagedTaskHandler<StoryPresenter.PagedObserver, Status> {
        public GetStoryHandler(StoryPresenter.PagedObserver inObs) { super(inObs); }

        @Override
        protected void handleFailureMessage(StoryPresenter.PagedObserver observer, String message) {
            observer.taskFailed("Failed to get story: " + message);
        }

        @Override
        protected void handleExceptionMessage(StoryPresenter.PagedObserver observer, String message) {
            observer.taskFailed("Failed to get story because of exception: " + message);
        }
    }
}
