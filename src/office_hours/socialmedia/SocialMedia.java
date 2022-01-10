package office_hours.socialmedia;

public abstract class SocialMedia {

    public String personalUrl;
    public int accountLength;
    public static String platform;

    public abstract void DirectMessage(SocialMedia receiver, String message);
    public abstract void post(String body);
    public abstract void notification();
}


/*
Social Media
• Create an abstract class for Social Media that has the following features:
- Direct messaging(String username, String message) - Post(String body)
- Notifications()
• The Social Media will also have the following fields:
- Personal URl (String) - Account length (int)
- Platform (static String)
 */