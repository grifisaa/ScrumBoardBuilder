package ScrumBoardBuilder.library;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Epic {
    private ArrayList<userStory> userStories;
    @Setter
    @Getter
    private String description;

    public void addUserStory(userStory userStory){
        userStories.add(userStory);
    }
}
