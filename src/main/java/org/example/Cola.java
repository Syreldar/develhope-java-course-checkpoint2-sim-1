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
        return quenchThirst;
    }

    public void onDrink(Person person)
    {
        person.setThirst(person.getThirst() - this.quenchThirst);
        System.out.println("Ahh! That Cola was so refreshing!");
    }
}
