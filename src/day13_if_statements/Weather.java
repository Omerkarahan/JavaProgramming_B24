package day13_if_statements;

public class Weather {

    public static void main(String[] args) {

        /*
        sunny, rainy, windy, snowy, foggy, cloudy,
         */

        String weather = "Windy";

        if(weather.equals("sunny")) {
            System.out.println("Its nice, go outside, ride a bike, code java");
        }else if(weather.equals("rainy")){
            System.out.println("Stay home, drink some tea,code java");
        }else if(weather.equals("windy") || weather.equals("Windy")){
            System.out.println("fly a kite and code java");
        } else if(weather.equals("snowy")){
            System.out.println("go skiing, drink hot choco, code java");
        } else {
            System.out.println("not a valid weather type, but code java anyway");
        }


    }
}
