package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Emotion {

    private static final String moodDescriptor = "Sad";

    public Sad() {
        super();

    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String emotionDescription() {
        return Sad.moodDescriptor;
    }
}
