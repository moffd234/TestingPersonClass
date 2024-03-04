package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private String job;
    private String favFood;
    private boolean isMarried;
    private boolean hasTwoArms;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.height = Integer.MAX_VALUE;
        this.favFood = "";
        this.job = "";
        this.isMarried = false;
        this.hasTwoArms = true;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String job, String favFood,
                  int age, int height, boolean isMarried, boolean hasTwoArms) {
        this.name = name;
        this.age = age;
        this.hasTwoArms = hasTwoArms;
        this.isMarried = isMarried;
        this.height = height;
        this.favFood = favFood;
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setFavFood(String favFood){
        this.favFood = favFood;
    }

    public String getFavFood(){
        return favFood;
    }


    public String getName() {
        return name;
    }

    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }

    public void setMarried(boolean isMarried){
        this.isMarried = isMarried;
    }
    public boolean getIsMarried(){
        return isMarried;
    }

    public void setHasTwoArms(boolean hasTwoArms){
        this.hasTwoArms = hasTwoArms;
    }

    public boolean getHasTwoArms(){
        return hasTwoArms;
    }

    public Integer getAge() {
        return age;
    }
}
