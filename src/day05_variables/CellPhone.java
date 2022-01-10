package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
         /*
         --------------------------------------------------
         Add new a class CellPhone

          */
        String brand = "Iphone";
        String model = "10";
        String color = "Black";
        double price = 1099.99;
        int storage = 500;
        boolean hasCamera = true;

        color = "silver"; //reassigned


        System.out.println("Information for the" + model);
        System.out.println(model + " is a " + brand + " phone");
        System.out.println("This phone comes in " + color + " and has " + storage + " GB of memory");
        System.out.println(" Has a camera: " + hasCamera);
        System.out.println(" All of this for $" + price);

        System.out.println(brand + " " + model);

        //approach two
        String info ="\t\t\tInformation for the" + model + "\n\t" + model + " is a " + brand + " phone" + "\n\tThis phone comes in " + color + " and has " + storage + " GB of memory\n\t" + "Has a camera:" + hasCamera + " \n\tAll of this for $" + price;
        System.out.println(info );





    }
}
