import org.junit.Before;
import org.junit.Test;

import jdk.internal.jline.internal.TestAccessible;

import static org.junit.Assert.*;

public class DogTest {

    Dog emptyDog;
    Dog dogWithOne;
    Dog dogWithMany;

    @Before
    public void setUp(){
        emptyDog = new Dog();

        dogWithOne = new Dog();
        dogWithOne.add("rope");

        dogWithMany = new Dog();
        dogWithMany.add("chew toy");
        dogWithMany.add("bone");
        dogWithMany.add("rope");
        dogWithMany.add("panda");
    }

    @Test
    public void testToysIsEmpty(){
        assertTrue(emptyDog.toysIsEmpty());
        assertFalse(emptyDog.toysIsEmpty());
    }
    
}