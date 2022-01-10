package day51_inheritance;

public class EBook extends Book{

    double size;
    int pages;

    public void read(){
        System.out.println("Reading " + title);
    }

}

// Ebook is a Book
