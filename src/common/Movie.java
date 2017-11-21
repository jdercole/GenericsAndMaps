package common;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable<Movie>, Iterable {
    private int movieId;
    private String title;
    private String director;
    

    public Movie(int movieId, String title, String director) {
        this.movieId = movieId;
        this.title = title;
        this.director = director;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.movieId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return "Movie ID: " + movieId + "\n" + "Movie title: " + title + "\n"
                + "Movie director: " + director;
    }
//    @Override
//    public int compareTo(Movie target) {
//       // - 1 = before, 0 = same, 1 = after
//       final int BEFORE = -1;
//       final int SAME = 0;
//       final int AFTER = 1;
//       int value = 0;
//       
//       if (this.getMovieId() == target.getMovieId()) {
//           value = SAME;
//       } else if (this.getMovieId() < target.getMovieId()){
//           value = BEFORE;
//       } else {
//           value = AFTER;
//       }
//       
//       return value;
//    }  

    @Override
    public int compareTo(Movie target) {
        //if using Strings like movie title
       return this.getTitle().compareTo(target.getTitle());
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }

}
