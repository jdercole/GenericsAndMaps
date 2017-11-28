package common;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Instlogin
 */
public class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private int rabiesId;

    public Dog(String name, int age, int rabiesId) {
        this.name = name;
        this.age = age;
        this.rabiesId = rabiesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRabiesId() {
        return rabiesId;
    }

    public void setRabiesId(int rabiesId) {
        this.rabiesId = rabiesId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.rabiesId;
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
        final Dog other = (Dog) obj;
        if (this.rabiesId != other.rabiesId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + ", rabiesId=" + rabiesId + '}';
    }

    @Override
    public int compareTo(Dog o) {
        Dog d = (Dog) o;
       final int BEFORE = -1;
       final int SAME = 0;
       final int AFTER = 1;
       int value = 0;
       
       if (this.getRabiesId() == d.getRabiesId()) {
           value = SAME;
       } else if (this.getRabiesId() > d.getRabiesId()){
           value = AFTER;
       } else {
           value = BEFORE;
       }
       
       return value;
    }
    
//    @Override
//    public int compareTo(Dog d) {
//       return this.getName().compareTo(d.getName());
//    }

    
}
