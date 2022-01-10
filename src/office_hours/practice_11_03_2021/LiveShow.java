package office_hours.practice_11_03_2021;

public class LiveShow extends Entertainment {

    String location;

    public LiveShow(String company, String location){
        super("Live Show", company);
        this.location = location;
    }

}

// new LiveShow("live show"
// new LiveShow("live show"

// new String("String", "apple") -> doesn't make sense

/*
create a class LiveShow
-> call super constructor
-> LiveShow is a child of Entertainment
instance variables:
- location (String)
constructor:
- initialize name, company, and location
-> call super constructor
-> hint: name value will be 'Live Show' for all subclasses
 */
