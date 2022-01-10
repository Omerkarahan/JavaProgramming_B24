package office_hours.practice_11_03_2021;

public class GetEntertained {
    public static void main(String[] args) {

        NetflixShow netflix = new NetflixShow(60,"Breaking Bad", 5, 2);

        System.out.println(netflix.company);
        System.out.println(netflix.name);
        System.out.println(netflix.showName);

        KevinHart kevin = new KevinHart("Chicago", "special name", "11/4/21");


    }
}