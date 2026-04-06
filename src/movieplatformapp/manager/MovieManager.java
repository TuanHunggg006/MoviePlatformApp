package movieplatformapp.manager;

import movieplatformapp.model.Movie;
import java.util.ArrayList;

public class MovieManager {
    private ArrayList<Movie> movieList;

    public MovieManager() {
        movieList = new ArrayList<>();
        loadSampleData();
    }

    public ArrayList<Movie> getAllMovies() {
        return movieList;
    }

    public void addMovie(Movie movie) {
        if (movie != null) {
            movieList.add(movie);
        }
    }

    public boolean removeMovie(String movieId) {
        Movie movie = findMovieById(movieId);
        if (movie != null) {
            movieList.remove(movie);
            return true;
        }
        return false;
    }

    public boolean updateMovie(Movie updatedMovie) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getMovieId().equalsIgnoreCase(updatedMovie.getMovieId())) {
                movieList.set(i, updatedMovie);
                return true;
            }
        }
        return false;
    }

    public Movie findMovieById(String movieId) {
        for (Movie movie : movieList) {
            if (movie.getMovieId().equalsIgnoreCase(movieId)) {
                return movie;
            }
        }
        return null;
    }

    public ArrayList<Movie> findByTitle(String keyword) {
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie movie : movieList) {
            if (movie.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public ArrayList<Movie> filterByGenre(String genre) {
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie movie : movieList) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                result.add(movie);
            }
        }
        return result;
    }

    private void loadSampleData() {
        movieList.add(new Movie("M01", "Avengers: Endgame", "Action", 181, 8.4, "Marvel superhero movie"));
        movieList.add(new Movie("M02", "Interstellar", "Sci-Fi", 169, 8.7, "Space exploration movie"));
        movieList.add(new Movie("M03", "Frozen", "Animation", 102, 7.4, "Animated Disney movie"));
        movieList.add(new Movie("M04", "Conan Movie", "Detective", 110, 7.8, "Detective anime movie"));
        movieList.add(new Movie("M05", "Spider-Man: No Way Home", "Action", 148, 8.2, "Spider-Man multiverse movie"));
    }
}