package org.example;

public class Yogurt implements Eatable, Drinkable {
    private int quenchHunger = 15;
    private int quenchThirst = 20;
    private boolean isPoisoned = false;

    public Yogurt() {}

    public Yogurt(boolean isPoisoned)
    {
        this.isPoisoned = isPoisoned;
    }

    public Yogurt(boolean isPoisoned, int quenchHunger, int quenchThirst)
    {
        this.isPoisoned = isPoisoned;
        this.quenchHunger = quenchHunger;
        this.quenchThirst = quenchThirst;
    }

    public int getQuenchHunger()
    {
        return this.quenchHunger;
    }

    public int getQuenchThirst()
    {
        return this.quenchThirst;
    }

    @Override
    public boolean isPoisoned()
    {
        return this.isPoisoned;
    }

    @Override
    public void onEat(Person person)
    {
        if (this.isPoisoned)
        {
            throw new RuntimeException("You can't eat this! This Yogurt is poisoned!");
        }

        person.reduceHunger(this.quenchHunger);
        System.out.println("Yum! That Yogurt was so tasty!");
    }

    @Override
    public void onDrink(Person person)
    {
        person.reduceThirst(this.quenchThirst);
        System.out.println("Wow! That Yogurt was so refreshing!");
    }
}
