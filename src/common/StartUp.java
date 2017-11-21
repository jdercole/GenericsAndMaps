
package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1, "Nightmare Before Christmas", "Tim Burton");
        Movie movie2 = new Movie(1, "Nightmare Before Christmas", "Tim Burton");
        Movie movie3 = new Movie(2, "Mrs. Doubtfire", "Steven Spielberg");
        Movie movie4 = new Movie(3, "The Graduate", "Someone");
    
        Map<String, Movie> movieSet = new HashMap<>();
        movieSet.put("1", movie1);
        movieSet.put("2", movie2);
        movieSet.put("3", movie3);
        movieSet.put("4", movie4);
//        
//        System.out.println("\nUsing a keyset, get the employees by key, unsorted, unordered...");
//        Set<String> keys = map.keySet();
//        for(String key : keys) {
//            Employee found = map.get(key);
//            System.out.println(found.toString());
//        }
        
        System.out.println(movieSet.get(1));
        
        Set<String> keys = movieSet.keySet();
        
        for (String key : keys) {
            Movie movie = movieSet.get(key);
            System.out.println(movie.toString());
        }
    }
    
}
