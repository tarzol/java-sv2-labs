package algorithmsfilter.zoo;

import algorithmsfilter.movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movies;

    public VideoTheque(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovies(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> selectMovie(Category cat) {
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getCategory().equals(cat) && movie.getRating()>3) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        VideoTheque videoTheque = new VideoTheque(movies);
        videoTheque.addMovies(new Movie("Titanic", Category.ROMANTIKUS, 4));
        videoTheque.addMovies(new Movie("Péntek 13", Category.THRILLER, 2));
        videoTheque.addMovies(new Movie("Abba", Category.ROMANTIKUS, 5));
        videoTheque.addMovies(new Movie("Nem jó", Category.ROMANTIKUS, 2));

        List<Movie> filteredMovies = videoTheque.selectMovie(Category.ROMANTIKUS);
        for (Movie movie : filteredMovies) {
            System.out.println("Film címe:"+movie.getTitle()+" tetszési index: "+movie.getRating());
        }
    }
}
