package office_hours.practice_11_03_2021;

public class Streaming extends Entertainment {

    double duration;

    public Streaming(String company, double duration){
        super("Streaming", company); // calls line 8 in the Entertainment class
        this.duration = duration;
    }

}

/*
create a class Streaming
-> Streaming is a child of Entertainment
instance variables:
- duration (double)
constructor:
- initialize name, company, and duration
-> call super constructor
-> hint: name value will be 'Streaming' for all subclasses
 */