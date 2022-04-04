package ScrumBoardBuilder.library;
public class App {
    public static void main(String[] args) {
        userStory user = new userStory("Userstory","this does this",
                "It's done if it works", "12","coby","Lots");
        System.out.println(user.toString());
    }
}
