package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
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
        String defName = "Brian";
        Date defBirthDate = new Date(55555);
        Integer defDogID = 333;
        d = new Dog(defName, defBirthDate, defDogID);
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
        String name="Snoopy";
        Date birthdate = new Date(5555555);
        Integer dogID=123;

        Dog expectedNewDog = new Dog(name,birthdate,dogID);

        Assert.assertEquals(expectedNewDog, AnimalFactory.createDog(name,birthdate));
*/


    @Test
    public void testDogSpeak() {
        // TODO - Create tests for `speak`
        //Given
        Dog doggo = new Dog(null, null, null);
        //When
        String expectedDogSound= "bark!";
        String doggoSound = doggo.speak();
        //Then
        Assert.assertEquals(expectedDogSound, doggoSound);
    }

    @Test
    public void testSetBirthDate() {
        // TODO - Create tests for `setBirthDate(Date birthDate)`
        //Given
        Dog doggo = new Dog(null, null, null);
        Date givenBD = new Date(55555);
        //When
        doggo.setBirthDate(givenBD);
        Date expectedDoggoBD = doggo.getBirthDate();
        //Then
        Assert.assertEquals(expectedDoggoBD,doggo.getBirthDate());
    }

    @Test
    public void testDogEat() {
        // TODO - Create tests for `void eat(Food food)`
        //Given
        Food dogFood = new Food();
        //When
        d.eat(dogFood);
        Integer expectedNumOfMealsEaten = 1;
        //Then
        Assert.assertEquals(expectedNumOfMealsEaten,d.getNumberOfMealsEaten());
    }

    @Test
    public void testGetID() {
        // TODO - Create tests for `Integer getId()`
        //Given
        //When
        Integer expectedID = 333;
        //Then
        Assert.assertEquals(expectedID, d.getId());


    }

    @Test
    public void testAnimalInstance() {
        // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
        //Given
        //When
        boolean expectedOutcome = true;
        //Then
        Assert.assertEquals(expectedOutcome, d instanceof Animal);
    }

    @Test
    public void testMammalInstance() {
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        //Given
        //When
        boolean expectedOutcome = true;
        //Then
        Assert.assertEquals(expectedOutcome, d instanceof Mammal);
    }
}
