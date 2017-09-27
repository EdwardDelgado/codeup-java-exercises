package movies;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " " + movie.getCategory());
        }
    }
}
