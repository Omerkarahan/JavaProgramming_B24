package office_hours.practice_10_27_2021;

import java.util.ArrayList;

public class Module {

    ArrayList<File> files;

    public Module(){
        this.files = new ArrayList<>();
    }

    public  Module(ArrayList<File> files){
        this();
        this.files.addAll(files);
    }

}

/*
create a class Module
instance variables:
- files (ArrayList of File objects)
constructor:
- no parameter -> create empty ArrayList object - initialize with given ArrayList of Files
-> Use chaining
methods:
- toString: print all the quiz information
- addFile(File): accept a File object and add the given File to the ArrayList
of Files of that module
Unit 5 - Problem Set
- removeFile(File): accepts a File object and remove the given File from the ArrayList of Files of that module
 */
