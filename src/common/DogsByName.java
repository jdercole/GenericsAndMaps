
package common;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Jenna
 */
public class DogsByName implements Comparator<Dog> {
   @Override
   public int compare(Dog dog1, Dog dog2) {
        return dog1.getName().compareTo(dog2.getName());
    }
    
}
