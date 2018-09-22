package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Emotion {

    private static final String moodDescriptor = "Happy";

    public Happy() {
        super();

    }

    public Happy(Date date) {
        super(date);
    }

    @Override
    public String emotionDescription() {
        return Happy.moodDescriptor;
    }
}
