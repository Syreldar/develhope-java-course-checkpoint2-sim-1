package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Person person = new Person("John");

        HashSet<Eatable> foods = new HashSet<>();
        foods.add(new Apple());
        foods.add(new Yogurt());
        foods.add(new Apple(true));

        HashMap<String, Drinkable> drinks = new HashMap<>();
        drinks.put("Coke", new Cola());
        drinks.put("Yogurt", new Yogurt());

        person.haveLunch(foods, drinks.values());
    }
}