package class_exercise;

//(q5)   create class movie...
//(a)  class movie with three class variables
public class Movie {
    String title;
    String studio;
    String rating;


    //(a) constructor for the class movie representing the variables as its values

    Movie(String t, String s, String r) {
        title = t;
        studio = s;
        rating = r;
    }


    //(b) Second consstructor for the class movie
    Movie(String t, String s) {
        title = t;
        studio = s;
        rating = "PG";
    }


    //(c) a method getPG....
    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating.equals("PG")) {
                pgMovies[index] = movies[i];
                index++;
            }
        }

        return pgMovies;
    }

    // (d) creating instances of class movie
    Movie ethio_movie = new Movie("Lamba", "16 movie studio", "PG");
}
