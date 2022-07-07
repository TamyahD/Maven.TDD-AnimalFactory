package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    CatHouse newCatHouse;
    @Before
    public void createCatHouseInstance() {
        newCatHouse = new CatHouse();
    }

    @Test
    public void testAddCat() {
        // TODO - Create tests for `void add(Cat cat)`
        //Given
        Cat newCat = new Cat("Simon", new Date(88888888), 123);
        //When
        Integer expectedNumOfCats = 1;
        Integer expectedID = 123;
        CatHouse.add(newCat);
        //Then
        Assert.assertEquals(newCat, CatHouse.getCatById(expectedID));

    }

    @Test
    public void testRemoveCatByID() {
        // TODO - Create tests for `void remove(Integer id)`
        Cat removeCat = new Cat("Shere Khan", new Date(999999999), 321);

        CatHouse.add(removeCat);
        Integer removalID = 321;
        Integer expectedNumBeforeRemoval = 1;
        Integer expectedNumAfterRemoval = 0;

        Assert.assertEquals(expectedNumBeforeRemoval,CatHouse.getNumberOfCats());
        CatHouse.remove(removalID);
        Assert.assertEquals(expectedNumAfterRemoval, CatHouse.getNumberOfCats());

    }

    @Test
    public void testRemoveCatByCat() {
        // TODO - Create tests for `void remove(Cat cat)`
        Cat removeCat = new Cat("Shere Khan", new Date(999999999), 321);

        CatHouse.add(removeCat);
        Integer expectedNumOfCatsB4Removal = 3;
        Integer expectedNumOfCatsAfterRemoval = 2;
        Assert.assertEquals(removeCat, CatHouse.getCatById(321));
        CatHouse.remove(removeCat);
        Assert.assertEquals(expectedNumOfCatsAfterRemoval, CatHouse.getNumberOfCats());


    }

    @Test
    public void testGetCatByID() {
        // TODO - Create tests for `Cat getCatById(Integer id)`
        Cat jungleCat = new Cat("Bagheera", new Date(), 444);
        CatHouse.add(jungleCat);
        Integer expectedID = 444;

        Assert.assertEquals(jungleCat, CatHouse.getCatById(expectedID));

    }

    @Test
    public void testGetNumOfCats() {
        // TODO - Create tests for `Integer getNumberOfCats()`
        Cat c1, c2, c3;
        c1 = new Cat(null,null,null);
        c2 = new Cat(null,null,null);
        c3 = new Cat(null,null,null);
        CatHouse.add(c1);
        CatHouse.add(c2);
        CatHouse.add(c3);

        Integer expectedNumOfCats = 5;

        Assert.assertEquals(expectedNumOfCats, CatHouse.getNumberOfCats());

    }
}
