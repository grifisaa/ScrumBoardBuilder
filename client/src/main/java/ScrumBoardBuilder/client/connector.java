package ScrumBoardBuilder.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import com.google.gson.Gson;
import lombok.Setter;

import static io.javalin.apibuilder.ApiBuilder.get;
import static javafx.application.Application.launch;

public class connector {
    @Setter
    public String username;

    public static final String reset = "http://%s:%s/api/reset";
    public static final String update = "http://%s:%s/api/update";
    public static final String state = "http://%s:%s/api/state";

    //Used to recieve a code for authenticating with Github API
    public static String login =" https://github.com/login/oauth/authorize?client_id=7000a23f3c270355853b&redirect_uri=http://localhost:9005";
    //    public static final String loginReturn = "https://github.com/login/oauth/access_token?client_id=7000a23f3c270355853b&redirect_uri=http://localhost:9000?client_secret={client_secret}?code=";
    String address;
    String port;
    Boolean initialize = false;
    HttpClient connector;
    Duration timeOut = Duration.ofSeconds(30);

    connector(){}

    private static class ConnectionSingleton{
        private static final connector INSTANCE = new connector();
    }

    public static connector instance(){
        return ConnectionSingleton.INSTANCE;
    }

    public void githubConnect(String name) throws IOException, InterruptedException {
        HttpRequest request = getMaker(login);
        System.out.println(request.uri().toURL());
//        HttpResponse<String> response = connector.send(request,HttpResponse.BodyHandlers.ofString());
//        System.out.println(response+ "OOO");
    }

    public void initalize(String address, String port){
        this.address = address;
        this.port = port;
        initialize = true;

        connector = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(timeOut)
                .build();
    }

    public HttpRequest login(){
        HttpRequest request = getMaker(login);
        HttpRequest poster = postMaker(login,request.uri().toString());
        return poster;
    }

    public void disconnect(){
        address = null;
        port = null;
        connector =  null;
    }
    public scrumBoardState reset() throws IOException, InterruptedException {
        HttpRequest request = getMaker(reset);
        return getBoardFormat(request);
    }

    public scrumBoardState getBoardFormat(HttpRequest request) throws IOException, InterruptedException {
        Gson boardGson = new Gson();
        HttpResponse<String> response = connector.send(request, HttpResponse.BodyHandlers.ofString());
        scrumBoardState scrumState = boardGson.fromJson(response.body(), scrumBoardState.class);
        return scrumState;
    }

    private HttpRequest getMaker(String command) {
        return HttpRequest.newBuilder()
                .uri(URI.create(String.format(command, address, port)))
                .timeout(timeOut)
                .GET()
                .build();
    }

    private HttpRequest postMaker(String command, String data){
        return HttpRequest.newBuilder()
                .uri(URI.create(String.format(command, address, port)))
                .timeout(timeOut)
                .POST(HttpRequest.BodyPublishers.ofString(data))
                .build();
    }
    public scrumBoardState currentState() throws IOException, InterruptedException {
        HttpRequest request = getMaker(state);
        return getBoardFormat(request);
    }
}

