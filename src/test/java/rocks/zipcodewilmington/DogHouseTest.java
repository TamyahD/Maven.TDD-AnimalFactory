package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDog() {
        // TODO - Create tests for `void add(Dog dog)`
        //Given
        //When
        //Then
        Dog newDog = new Dog("Snoopy", new Date(), 000);
        DogHouse.add(newDog);
        Integer expectNumOfDogs = DogHouse.getNumberOfDogs();
        Integer expectedID = 000;
//        Assert.assertEquals(newDog, DogHouse.getDogById(expectedID));
        Assert. assertEquals(expectNumOfDogs, DogHouse.getNumberOfDogs());

    }

    @Test
    public void testRemoveDogByID() {
        // TODO - Create tests for `void remove(Integer id)`
        //Given
        //When
        //Then
        Integer removalDogID = 000;
        Integer expectedNumB4Removal = DogHouse.getNumberOfDogs();
        Integer expectedNumAfterRemoval = expectedNumB4Removal-1;

        Assert.assertEquals(expectedNumB4Removal, DogHouse.getNumberOfDogs());
        DogHouse.remove(removalDogID);
        Assert.assertEquals(expectedNumAfterRemoval, DogHouse.getNumberOfDogs());

    }

    @Test
    public void testRemoveDogByDog() {
        // TODO - Create tests for `void remove(Dog dog)`
        //Given
        //When
        //Then
        Dog removalDog = new Dog("Beethoven", null, null);
        Integer expectedNumOfDogsB4Removal = DogHouse.getNumberOfDogs();
        Integer expectedNumOfDogsAfterRemoval = expectedNumOfDogsB4Removal-1;
        Assert.assertEquals(expectedNumOfDogsB4Removal, DogHouse.getNumberOfDogs());
        DogHouse.remove(removalDog);
        Assert.assertEquals(expectedNumOfDogsB4Removal, DogHouse.getNumberOfDogs());


    }

//    @Test
//    public void testRemoveDogByID() {
//
//    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

}
