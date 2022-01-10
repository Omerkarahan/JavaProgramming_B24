package office_hours.socialmedia;

import java.util.ArrayList;
import java.util.List;

public class FacebookUser extends SocialMedia{

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private List<Post> allPost;


    static {
        platform = "Facebook";
    }

    // if u wanted to access platform how could u do it?  FacebookUser.platform

    // SocialMedia.platform

    public FacebookUser(String username, String password){
        this.username = username;
        setPassword(password);
        personalUrl = "Facebook.com/" + username;
        allPost = new ArrayList<>();
    }
    public FacebookUser(String username, String password, String fullName, int age , int numberOfFriends){
        this(username, password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }

    public FacebookUser(String username, String password, String fullName){
        this(username,password);
        setFullName(fullName);
    }

    @Override
    public void DirectMessage(SocialMedia receiver, String message) {
        System.out.println("Sending message to: " +((FacebookUser)receiver).getFullName());
        System.out.println("Message : " + message);
    }

    @Override
    public void post(String body) {
        allPost.add(new Post(body));
    }

    @Override
    public void notification() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(username)) {
            System.out.println("Password should not contain the username, default password set");
            this.password = "default";
        } else {
            this.password = password;
        }
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        boolean isValidName = true;

        for(int i = 0; i < fullName.length(); i++){
            if(!Character.isLetter(fullName.charAt(i)) && fullName.charAt(i) != ' '){
                System.out.println("Name is invalid");
                isValidName = false;
                break;
            }
        }

        this.fullName = isValidName ? fullName : "No Name";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 13 && age < 130){
            this.age = age;
        } else {
            System.out.println("This is invalid age");
        }

    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if(numberOfFriends >= 0 && numberOfFriends <= 5000){
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid number of friends");
        }

    }

    public List<Post> getAllPost() {
        return allPost;
    }

    public void setAllPost(List<Post> allPost) {
        this.allPost = allPost;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", \nAllPosts: " + allPost +
                '}';
    }
}

/*
Facebook User
• Create a class for a facebook user which inherits the Social Media class and has additional instance variables: username, password, full name, age, number of friends, and posts (ArrayList of Post)
• Encapsulate all the variables.
• Set the platform for "Facebook" using static block
• Create a constructor that will create a Facebook user by taking username and password.
- If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
- Create and assign the user's person url by using 'facebook.com/' and adding their username
- Create an empty ArrayList of Posts
 */