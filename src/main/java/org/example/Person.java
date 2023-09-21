package org.example;

import java.util.Collection;

public class Person
{
    private String name;
    private int hunger;
    private int thirst;

    public Person() {}

    public Person(String name)
    {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
    }

    public Person(String name, int hunger, int thirst)
    {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHunger()
    {
        return this.hunger;
    }

    public void setHunger(int hunger)
    {
        this.hunger = hunger;
    }

    public int getThirst()
    {
        return this.thirst;
    }

    public void setThirst(int thirst)
    {
        this.thirst = thirst;
    }

    public void reduceHunger(int value)
    {
        this.hunger -= value;
    }

    public void reduceThirst(int value)
    {
        this.thirst -= value;
    }

    public void eat(Eatable food) throws Exception
    {
        if (food.isPoisoned())
        {
            throw new Exception(String.format("You can't eat this %s! It's poisoned!", food.getClass().getSimpleName()));
        }

        food.onEat(this);
    }

    public void drink(Drinkable drink)
    {
        drink.onDrink(this);
    }

    public void haveLunch(Collection<Eatable> foods, Collection<Drinkable> drinks)
    {
        for (Eatable food : foods)
        {
            try {
                this.eat(food);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (Drinkable drink : drinks)
        {
            try {
                this.drink(drink);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}