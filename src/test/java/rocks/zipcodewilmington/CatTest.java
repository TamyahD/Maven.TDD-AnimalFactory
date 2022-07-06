package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    Cat c;

    @Before
    public void createCatInstance() {
        String defName = "Tom";
        Date defBirthDate = new Date(24038580);
        Integer defID = 111;
        c = new Cat(defName,defBirthDate,defID);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // TODO - Create tests for `void setName(String name)`
//        String name = "Garfield";
//        Date birthDate = new Date();
//        Integer catID = 100;

        //When
//        Cat c = new Cat(name, birthDate, catID);
        //Given
        String newName = "Bagheera";

        //When
        c.setName(newName);
        //Then
        Assert.assertEquals(newName, c.getName());
    }

    @Test
    public void testSetBirthDate() {
        // TODO - Create tests for `setBirthDate(Date birthDate)`
        //Given
        Date newBirthDate = new Date(2515900);
        //When
        c.setBirthDate(newBirthDate);
        //Then
        Assert.assertEquals(newBirthDate, c.getBirthDate());
    }

    @Test
    public void testCatSpeak() {
        // TODO - Create tests for `speak`
        //Given
        String expectedCatSound = "meow!";
        //Then
        Assert.assertEquals(expectedCatSound, c.speak());
    }

    @Test
    public void testCatEat() {
        // TODO - Create tests for `void eat(Food food)`
        //Given
        Food catFood = new Food();
        //When
        c.eat(catFood);
        Integer expectedNumOfMealsEaten = 1;
        //Then
        Assert.assertEquals(expectedNumOfMealsEaten, c.getNumberOfMealsEaten());

    }

    @Test
    public void testGetID() {
        // TODO - Create tests for `Integer getId()`
        //Given
        //When
        Integer catID = 111;
        //Then
        Assert.assertEquals(catID, c.getId());
    }

    @Test
    public void testAnimalInstance() {
        // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
        //Given
//        Food fd = new Food();
        //When
        boolean expectedOutcome = true;
        //Then
        Assert.assertEquals(expectedOutcome,c instanceof Animal);
    }

    @Test
    public void testMammalInstance() {
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        //Given
        //When
        boolean expectedOutcome = true;
        //Then
        Assert.assertEquals(expectedOutcome, c instanceof Mammal);
    }



}
