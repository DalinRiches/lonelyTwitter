package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
import java.util.List;

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected List<Emotion> emotions;

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return this.date;
    }

    public void addEmotion(Emotion emotion) {
        this.emotions.add(emotion);
    }

    public List<Emotion> getEmotions() {
        return this.emotions;
    }

    public abstract Boolean isImportant();
}
