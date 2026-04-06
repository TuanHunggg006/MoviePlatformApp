package movieplatformapp.model;

import java.util.ArrayList;

public class FavoriteList {
    private ArrayList<Movie> favoriteMovies;

    public FavoriteList() {
        favoriteMovies = new ArrayList<>();
    }

    public ArrayList<Movie> getFavoriteMovies() {
        return favoriteMovies;
    }

    public void addFavorite(Movie movie) {
        if (movie != null && !favoriteMovies.contains(movie)) {
            favoriteMovies.add(movie);
        }
    }

    public void removeFavorite(Movie movie) {
        favoriteMovies.remove(movie);
    }
}