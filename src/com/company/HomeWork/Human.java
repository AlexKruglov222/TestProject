package com.company.HomeWork;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    private String father;
    private String mother;

    public Human(String name, boolean gender, int age, String father, String mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return this.name;
    }

    public boolean getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getFather() {
        return this.father;
    }

    public String getMother() {
        return this.mother;
    }

    @Override
    public String toString() {
        if(this.gender)return "Имя: " + this.name + ", пол: мужской, возраст: " + this.age + ", отец: " + this.father + ", мать: " + this.mother;
        else return "Имя: " + this.name + ", пол: женский, возраст: " + this.age + ", отец: " + this.father + ", мать: " + this.mother;
    }
}
