package movies;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        printMovies(movies, "horror");
        printMovies(movies, "drama");
        printMovies(movies, "");

    }

    public static void printMovies(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if(category.equalsIgnoreCase(movie.getCategory())) {
                System.out.println(movie.getName() + " " + movie.getCategory());
            }else if(category.isEmpty()){
                System.out.println(movie.getName() + " " + movie.getCategory());
            }
        }
    }
}
