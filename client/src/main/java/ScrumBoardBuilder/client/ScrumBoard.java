package ScrumBoardBuilder.client;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class ScrumBoard {
    @Setter
    @Getter
    private scrumBoardState scrumBoardState;
    private ArrayList<userStory> userStories;

    public ScrumBoard(){
        scrumBoardState = new scrumBoardState();
    }

    public void addUserStory(userStory userStory){
        scrumBoardState.getUserStories().add(userStory);
    }

    public void reset(){
        int i = 0;
        for(userStory u : scrumBoardState.getUserStories()){
            scrumBoardState.getUserStories().remove(i);
            i++;
        }
    }

}
