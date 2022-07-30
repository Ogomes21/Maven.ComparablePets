package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PetTest {
    @Test
    public void sortPetsByTypeThenNameTest() {
        Cat cat0 = new Cat("Milo");
        Dog dog1 = new Dog("Fido");
        Cat cat1 = new Cat("Fido");
        Pet[] myPetList = new Pet[]{cat0, dog1, cat1};
        Pet[] expected = new Pet[]{cat1, cat0, dog1};

        Pet[] actual = Pet.sortPetsByTypeThenName(myPetList);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void compareToTest() {
        Cat cat0 = new Cat("Milo");
        Dog dog1 = new Dog("Fido");
        Cat cat1 = new Cat("Fido");
        Assert.assertTrue(cat1.compareTo(dog1) <0);
        Assert.assertTrue(dog1.compareTo(cat0) <0);

    }
}
