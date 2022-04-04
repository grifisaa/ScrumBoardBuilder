/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import io.javalin.Javalin;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.post;
import ScrumBoardBuilder.library.ScrumBoard;



public class App {
    public static void main(String[] args) {
        ScrumBoard scrumBoard = new ScrumBoard();
        QueuedThreadPool thread = new QueuedThreadPool(200, 8, 60000);
        Javalin app = Javalin.create(config ->
                config.server(() ->
                        new Server(thread))).start(9005);

        app.routes(() -> {
        });
    }
}