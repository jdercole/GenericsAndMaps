
package common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
//        Movie movie1 = new Movie(1, "Nightmare Before Christmas", "Tim Burton");
//        Movie movie2 = new Movie(1, "Nightmare Before Christmas", "Tim Burton");
//        Movie movie3 = new Movie(2, "Mrs. Doubtfire", "Steven Spielberg");
//        Movie movie4 = new Movie(3, "The Graduate", "Someone");
//    
//        Map<String, Movie> movieSet = new HashMap<>();
//        movieSet.put("1", movie1);
//        movieSet.put("2", movie2);
//        movieSet.put("3", movie3);
//        movieSet.put("4", movie4);
////        
////        System.out.println("\nUsing a keyset, get the employees by key, unsorted, unordered...");
////        Set<String> keys = map.keySet();
////        for(String key : keys) {
////            Employee found = map.get(key);
////            System.out.println(found.toString());
////        }
//        
//        System.out.println(movieSet.get(1));
//        
//        Set<String> keys = movieSet.keySet();
//        
//        for (String key : keys) {
//            Movie movie = movieSet.get(key);
//            System.out.println(movie.toString());
//        }
//  Task 1
    System.out.println("Task 1:");
        Dog dog = new Dog("George", 1, 2);
        Dog dog2 = new Dog("John", 4, 1);
        Dog dog3 = new Dog("Abe", 6, 3);
        Dog dog4 = new Dog("Abe", 6, 3);
    
        Set<Dog> set = new TreeSet<Dog>();
        set.add(dog);
        set.add(dog2);
        set.add(dog3);
        set.add(dog4);
        for(Dog d : set) {
            System.out.println(d.toString());
        }
        
        //Task 2
        System.out.println("Task 2:");
        DogsByName namedog = new DogsByName();
        
        List<Dog> dogList = new ArrayList<>(set);
 
        Collections.sort(dogList, namedog);
        System.out.println(dogList.toString());
        
        // Task 3
        System.out.println("Task 3:");
        Map<String, Dog> dogMap = new TreeMap<>();
        
        dogMap.put("1", dog);
        dogMap.put("2", dog2);
        dogMap.put("3", dog3);
        dogMap.put("4", dog4);
        
        Collection<Dog> values = dogMap.values();
        List<Dog> sortedDogs = new ArrayList<Dog>(values);
        Collections.sort(sortedDogs);
        
        for(Dog d: sortedDogs) {
            System.out.println(d);
        }
        
        
        //4
        System.out.println("Task 4:");
        Dog[] dogs = {dog, dog2, dog3, dog4};
        // OK, now let's sort the array with the help of the Arrays class:
        // Comment this line out and no sorting will be performed.
        Arrays.sort(dogs);

        for(Dog d : dogs) {
            System.out.println(d);
        }

    }
    
}
