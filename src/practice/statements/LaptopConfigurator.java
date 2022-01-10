package practice.statements;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        double total = 0;
        if(screenSize == 13.3){
            total += 200;
        }
        if(screenSize == 15.0){
            total += 300;
        }
        if(screenSize == 17.3){
            total += 400;
        }

        System.out.println("Select CPU type");
        String CPU = input.next();
        if(CPU.equals("i3")){
            total += 150;
        }
        if(CPU.equals("i5")){
            total += 250;
        }
        if(CPU.equals("i7")){
            total += 350;
        }

        System.out.println("Select RAM size:");
        double ram = input.nextDouble();
        total += 50 * (ram / 4);

        System.out.println("Select storage type");
        String storageType = input.next();
        System.out.println("Enter memory size");
       double memorySize = input.nextDouble();
        if(storageType.equals("SSD")){
            total += 100 * (memorySize / 500);
        }
        if (storageType.equals("HDD")){
            total += 50 * (memorySize / 500);
        }
        System.out.println("Enter screen resolution:");
        String screenResolution = input.next();
        if (screenResolution.equals("FULLHD")){
            total += 100;
        }
        if(screenResolution.equals("4K")){
            total += 200;
        }
        System.out.println("Laptop price is: $" + total);

    }
}
