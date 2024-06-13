package org.autojava;

import java.lang.annotation.Annotation;

@Beethoven
public class Dog {
    private String breed;
    private String name;
    private int weight;

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void getDogCharacteristics(){
        System.out.println("breed: "+ breed);
        System.out.println("name: "+ name);
        System.out.println("weight: "+ weight);
    }

    public Beethoven getBeethoven() {
        Dog dog = new Dog();
        //dog.getDogCharacteristics();
        Class reflectedClass = dog.getClass();
        Annotation annot = reflectedClass.getAnnotation(Beethoven.class);
        Beethoven beethoven = (Beethoven)annot;
        return beethoven;
    }
}
