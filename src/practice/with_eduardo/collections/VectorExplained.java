package practice.with_eduardo.collections;

import java.util.Vector;

public class VectorExplained {

    /** Vector is similar to ArrayList. It is automatically SYNCHRONIZED (thread-safe) :: Slow */
    /** Initial size is 10,
    /** Allows DUPLICATES, ORDERED by INSERTION, accepts multiple objects */
    /** Implements Serializable, Cloneable and RandomAccess interfaces */

    public static void main(String[] args) {

        String[] platform1 = {"PS5"};
        String[] platform2 = {"Nintendo", "Wii U"};

        VideoGame game1 = new VideoGame("Battlefield 1", 2001, platform1);
        VideoGame game2 = new VideoGame("Pokemon Sun", 2016, platform2);
        VideoGame game3 = new VideoGame("The Legend of Zelda", 2017, platform2);
        VideoGame game4 = new VideoGame("", 2002, platform2);

        Vector<VideoGame> videoGames = new Vector<>();
        videoGames.add(game1);
        videoGames.add(game2);
        videoGames.add(game3);
        videoGames.forEach(System.out::println);

        /* int size() */
        System.out.println(videoGames.size());

        /* int capacity() : by default is 10. If it needs more capacity, the capacity will be multiplied by 2 */
        System.out.println(videoGames.capacity());

        /* void addElement() */
        videoGames.addElement(game4);


    }
}
