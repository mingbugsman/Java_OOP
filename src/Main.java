

import Design_Pattern.Facade_Pattern.Home_Theater_System_Basic.Client;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Client client = new Client();
        client.setMovieToWatch("Interstellar");
        client.watchMovie();

        client.EndMovie();
        client.watchMovie();
        kb.close();
    }


}

