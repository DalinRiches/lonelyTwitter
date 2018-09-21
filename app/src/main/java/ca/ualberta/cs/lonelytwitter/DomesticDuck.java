package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class DomesticDuck extends Animal implements FlyingBehaviour {

    public DomesticDuck(String type, String food)
    {
        super(type, food);
    }

    public void swim()
    {
        Log.d("Duck.swim()", "I love to swim");
    }

    public void doesLikeFlying()
    {
        Log.d("Duck.doesLikeFlying", "No, only if cat attacks me");
    }
}
