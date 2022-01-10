package office_hours.practice_11_03_2021;

public final class KevinHart extends LiveShow{

    String special;
    String date;

    public KevinHart(String location, String special, String date){
        super("Kevin Hart inc.", location);
        this.special = special;
        this.date = date;
    }



}

/*
create a class KevinHart
-> KevinHart is a child of LiveShow
instance variables:
- performer (String)
- date (String format Ex: mm/dd/yyyy)
constructor:
- initialize name, company and location, performer, date
-> call super constructor
-> hint: name value will be 'Live Show' for all subclasses
 */
