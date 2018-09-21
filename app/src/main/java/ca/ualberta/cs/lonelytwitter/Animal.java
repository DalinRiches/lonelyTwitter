package ca.ualberta.cs.lonelytwitter;

public abstract class Animal {
    protected String food;
    protected String type;

    public Animal(String type, String food)
    {
        this.type = type;
        this.food = food;
    }

    public void setFood(String food)
    {
        this.food = food;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getFood()
    {
        return this.food;
    }

    public String getType()
    {
        return this.type;
    }

    public abstract void swim();
}
