package ScrumBoardBuilder.client;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.ArrayList.*;

class scrumBoardState {
    @Setter
    @Getter
    private ArrayList<Epic> epics = new ArrayList<Epic>();

    @Getter
    @Setter
    private ArrayList<userStory> userStories = new ArrayList<userStory>();
    public scrumBoardState(){

    }
}