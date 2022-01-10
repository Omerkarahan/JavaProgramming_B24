package day32_array;

public class AWS {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        // you could also do
        //String [] allZones = zones.split(",");

        for(String each : zones.split(",")){ // for(String each : allZones)){
            System.out.println("Deploying " + app + " to " + each); // allZones[i]

        }
//
//        for(int i = 0; i < allZones.length; i++){
//            System.out.println("Deploying " + app + " to " + allZones[i]);
//        }

    }
}
