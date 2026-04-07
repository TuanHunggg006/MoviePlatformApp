//package movieplatformapp;
//
//import movieplatformapp.manager.AuthManager;
//import movieplatformapp.manager.MovieManager;
//import movieplatformapp.model.Movie;
//import movieplatformapp.model.User;
//
//public class MoviePlatformApp {
//    public static void main(String[] args) {
//        AuthManager authManager = new AuthManager();
//        User user = authManager.login("admin", "123");
//
//        if (user != null) {
//            System.out.println("Login success: " + user.getFullName());
//        } else {
//            System.out.println("Login failed");
//        }
//
//        MovieManager movieManager = new MovieManager();
//
//        System.out.println("=== Movie List ===");
//        for (Movie movie : movieManager.getAllMovies()) {
//            System.out.println(movie);
//        }
//    }
//}
package movieplatformapp;

import movieplatformapp.manager.AuthManager;
import movieplatformapp.manager.MovieManager;
import movieplatformapp.model.Movie;
import movieplatformapp.model.User;

public class MoviePlatformApp {
    public static void main(String[] args) {
        AuthManager authManager = new AuthManager();
        User user = authManager.login("admin", "123");

        if (user != null) {
            System.out.println("Login success: " + user.getFullName());
        } else {
            System.out.println("Login failed");
        }

        MovieManager movieManager = new MovieManager();

        System.out.println("=== Movie List ===");
        for (Movie movie : movieManager.getAllMovies()) {
            System.out.println(movie);
        }
    }
}