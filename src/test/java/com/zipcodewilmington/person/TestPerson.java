package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */

// Finished
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        Integer expectedHeight = Integer.MAX_VALUE;
        String expectedJob = "";
        String expectedFavFood = "";
        Boolean expectedIsMarried = false;
        Boolean expectedHasTwoArms = true;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        String actualJob = person.getJob();
        String actualFavFood = person.getFavFood();
        Boolean actualIsMarried = person.getIsMarried();
        Boolean actualHasTwoArms = person.getHasTwoArms();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeight();



        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedJob, actualJob);
        Assert.assertEquals(expectedFavFood, actualFavFood);
        Assert.assertEquals(expectedIsMarried, actualIsMarried);
        Assert.assertEquals(expectedHasTwoArms, actualHasTwoArms);
    }

    @Test
    public void testConstructorWithAll(){

        // Given
        String expectedName = "Dan";
        Integer expectedAge = 24;

        Integer expectedHeight = 59;
        String expectedJob = "None";
        String expectedFavFood = "Hoagie";
        Boolean expectedIsMarried = false;
        Boolean expectedHasTwoArms = true;

        // When
        Person person = new Person(expectedName, expectedJob, expectedFavFood,
        expectedAge, expectedHeight, expectedIsMarried, expectedHasTwoArms);

        // Then
        String actualName = person.getName();
        String actualJob = person.getJob();
        String actualFavFood = person.getFavFood();
        Boolean actualIsMarried = person.getIsMarried();
        Boolean actualHasTwoArms = person.getHasTwoArms();
        Integer actualAge = person.getAge();
        Integer actualHeight = person.getHeight();



        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedJob, actualJob);
        Assert.assertEquals(expectedFavFood, actualFavFood);
        Assert.assertEquals(expectedIsMarried, actualIsMarried);
        Assert.assertEquals(expectedHasTwoArms, actualHasTwoArms);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetHeight() {

        // Given
        Person person = new Person();
        Integer expected = 60;

        // When
        person.setHeight(expected);
        Integer actual = person.getHeight();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetJob() {

        // Given
        Person person = new Person();
        String expected = "Engineer";

        // When
        person.setJob(expected);
        String actual = person.getJob();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetFavFood() {

        // Given
        Person person = new Person();
        String expected = "Hoagie";

        // When
        person.setFavFood(expected);
        String actual = person.getFavFood();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetIsMarried() {

        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setIsMarried(expected);
        boolean actual = person.getIsMarried();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHasTwoArms() {

        // Given
        Person person = new Person();
        boolean expected = false;

        // When
        person.setHasTwoArms(expected);
        boolean actual = person.getHasTwoArms();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
}
