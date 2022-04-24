package ScrumBoardBuilder.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class userStory {
    private String title;
    private String description;
    private String acceptanceCriteria;
    private String priorityNum;
    private String effort;
    private String teamMemberAssignment;


    public userStory(String title, String description, String acceptanceCriteria, String priorityNum, String teamMemberAssignment, String effort){
        setTitle(title);
        setTeamMemberAssignment(teamMemberAssignment);
        setDescription(description);
        setEffort(effort);
        setAcceptanceCriteria(acceptanceCriteria);
        setPriorityNum(priorityNum);
    }

    @Override
    public String toString() {
        return title + "\n" + "Priority: " + priorityNum + "\n" + "Effort: " + effort
                + "\n" + "\n" + "Description: " + description + "\n" + "Acceptance Criteria: " + acceptanceCriteria + "\n" + "Assigned to: " + teamMemberAssignment;
    }
}
