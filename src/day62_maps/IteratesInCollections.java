package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratesInCollections {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(Arrays.asList("James", "Adam","Anna", "Beth"));

        System.out.println(list);

        Iterator<String> it = list.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());

        while (it.hasNext()){
            String name = it.next();
            if(name.startsWith("A")){
                it.remove();
            }

        }  System.out.println(list);
    }
}
