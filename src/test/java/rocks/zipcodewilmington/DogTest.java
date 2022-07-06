package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    Dog d;

    @Before
    public void createDogInstance() {
        String name = "Brian";
        Date birthDate = new Date();
        Integer dogID = 333;

        Dog d = new Dog(name, birthDate, dogID);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

/*
    @Test
    public void testSetName() {
*/
/*
        String name="Snoopy";
        Date birthdate = new Date(5555555);
        Integer dogID=123;

        Dog expectedNewDog = new Dog(name,birthdate,dogID);

        Assert.assertEquals(expectedNewDog, AnimalFactory.createDog(name,birthdate));
*//*

    }
*/



    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
}
