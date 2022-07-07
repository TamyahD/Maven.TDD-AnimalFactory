package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void createDogTest() {
        //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
        //Given
        String expectedName = "Bingo";
        Date expectedBirthDate = new Date(987654321);

        //When
        Dog doggoB = AnimalFactory.createDog(expectedName, expectedBirthDate);

        //Then
        Assert.assertEquals(expectedName, doggoB.getName());
        Assert.assertEquals(expectedBirthDate, doggoB.getBirthDate());

    }

    @Test
    public void createCatTest() {
        //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
        //Given
        String expectedName = "Bagheera";
        Date expectedDate = new Date(123456789);

        //When
        Cat gato = AnimalFactory.createCat(expectedName, expectedDate);

        //Then
        Assert.assertEquals(expectedName, gato.getName());
        Assert.assertEquals(expectedDate, gato.getBirthDate());
    }
}
