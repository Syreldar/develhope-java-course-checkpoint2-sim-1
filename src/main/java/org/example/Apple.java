package org.example;

public class Apple implements Eatable {
    private int quenchHunger = 10;
    private boolean isPoisoned = false;

    public Apple() {}

    public Apple(boolean isPoisoned)
    {
        this.isPoisoned = isPoisoned;
    }

    public Apple(boolean isPoisoned, int quenchHunger)
    {
        this.isPoisoned = isPoisoned;
        this.quenchHunger = quenchHunger;
    }

    public int getQuenchHunger()
    {
        return this.quenchHunger;
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
            throw new RuntimeException("You can't eat this! This Apple is poisoned!");
        }

        person.reduceHunger(this.quenchHunger);
        System.out.println("Yum! That Apple was so good!");
    }
}