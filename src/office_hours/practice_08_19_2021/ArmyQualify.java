package office_hours.practice_08_19_2021;

public class ArmyQualify {
    public static void main(String[] args) {
        String citizenship = "US";
        boolean resident = true;
        boolean hasHighSchoolDiploma = true;
        int age = 40;

        if(citizenship.equalsIgnoreCase("us") || resident){

            if(age >= 18 && age <= 35){

                if(hasHighSchoolDiploma){

                    System.out.println("You are qualified for the U.S Army");
                } else{
                    System.out.println("You must have a high school diploma");
                }

            } else{
                System.out.println("Your age must be between 18 to 35 years old");
            }

        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }


    }

}
