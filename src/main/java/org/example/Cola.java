package org.example;

public class Cola implements Drinkable {
    private int quenchThirst = 20;

    public Cola() {}

    public Cola(int quenchThirst)
    {
        this.quenchThirst = quenchThirst;
    }

    public int getQuenchThirst()
    {
        return this.quenchThirst;
    }

    @Override
    public void onDrink(Person person)
    {
        person.reduceThirst(this.quenchThirst);
        System.out.println("Ahh! That Cola was so refreshing!");
    }
}
