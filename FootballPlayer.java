import java.util.*;
public class FootballPlayer {
    public static void main(String[] args) {
        // Task 1
        String name;
        int age;
        float height_m;
        float weight_lb;
        int jersey_number;

        Scanner input = new Scanner(System.in);


        System.out.println("Name: ");
        name = input.nextLine();

        System.out.println("Age: ");
        age = input.nextInt();

        System.out.println("Height (m): ");
        height_m = input.nextFloat();

        System.out.println("Weight (lb): ");
        weight_lb = input.nextFloat();

        System.out.println("Jersey number: ");
        jersey_number = input.nextInt();

        System.out.println("Weight(lb): " + weight_lb);
        System.out.println("Initial Report");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height(m): " + height_m);
        System.out.println("Weight(lb): " + weight_lb);
        System.out.println("Jersey number: " + jersey_number);

        // Task 2
        final float POUND = 0.45359327f;
        final int METER = 100;

        int weight_kg = (int) (weight_lb * POUND);
        int height_cm = (int) (height_m * METER);

        System.out.println("Details Update");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height(cm): " + height_cm);
        System.out.println("Weight(kg): " + weight_lb);
        System.out.println("Jersey number: " + jersey_number);

        //Task 3
        age++;
        jersey_number--;
        System.out.println("Current age of player: " + age);
        System.out.println("Current jersey number of player: " + jersey_number);

        //Task 4
        boolean eligible = ((age >= 18) && (age < 35)) && (weight_kg < 90);
        if (!eligible) {
            System.out.println(" You are eligible");
        }
        else {
            System.out.println("Not Eligible");
        }

        boolean age_eligibility = age>90;
        boolean weight_eligibility = weight_kg>=90;
        if (age_eligibility || weight_eligibility) {
            System.out.println("Player has a problem (either too young or too heavy");
        }

        /* boolean eligible = ((age >= 18) && (age < 35)) && (weight_kg < 90);
        if (!eligible) {
            System.out.println(" You are eligible");
         }
         else {
         System.out.println("Not Eligible");
         }
        */

        // Task 5
        if (age < 20) {
            System.out.println("Rising Star");
        }

        else if (age >= 20 && age  <= 30){
            System.out.println("Prime Player");
        }

        else if (age > 30) {
            System.out.println("Veteran");
        }

        // Task 6
        String position;
        switch (jersey_number) {
            case 1:
                position = "Goalkeeper";
                System.out.println("Player position: " + position);
                break;
            case 2:
                position = "Defender";
                System.out.println("Player position: " + position);
                break;
            case 5:
                position = "Winger";
                System.out.println("Player position: " + position);
                break;
            case 6:
                position = "Midfielder";
                System.out.println("Player position: " + position);
                break;
            case 7:
                position = "Winger";
                System.out.println("Player position: " + position);
                break;
            case 8:
                position = "Midfielder";
                System.out.println("Player position: " + position);
                break;
            case 9:
                position = "Striker";
                System.out.println("Player position: " + position);
                break;
            case 10:
                position = "Playmaker";
                System.out.println("Player position: " + position);
                break;
            case 11:
                position = "Winger";
                System.out.println("Player position: " + position);
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        // Task 7 (Part A)
        switch (jersey_number) {
            case 1:
                position = "Goalkeeper";
                System.out.println("Player position: " + position);
                break;
            case 2:
                position = "Defender";
                System.out.println("Player position: " + position);
            case 5:
                position = "Winger";
                System.out.println("Player position: " + position);
                break;
            case 6:
                position = "Midfielder";
                System.out.println("Player position: " + position);
            case 7:
                position = "Winger";
                System.out.println("Player position: " + position);
            case 8:
                position = "Midfielder";
                System.out.println("Player position: " + position);
                break;
            case 9:
                position = "Striker";
                System.out.println("Player position: " + position);
                break;
            case 10:
                position = "Playmaker";
                System.out.println("Player position: " + position);
                break;
            case 11:
                position = "Winger";
                System.out.println("Player position: " + position);
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        //Task 7 (Part B)
        switch (jersey_number) {
            case 1:
                position = "Goalkeeper";
                System.out.println("Player position: " + position);
                break;
            case 2:
                position = "Defender";
                System.out.println("Player position: " + position);
                break;
            case 5:
                position = "Winger";
                System.out.println("Player position: " + position);
            case 7:
                position = "Winger";
                System.out.println("Player position: " + position);
            case 11:
                position = "Winger";
                System.out.println("Player position: " + position);
                break;
            case 6:
                position = "Midfielder";
                System.out.println("Player position: " + position);
            case 8:
                position = "Midfielder";
                System.out.println("Player position: " + position);
                break;
            case 9:
                position = "Striker";
                System.out.println("Player position: " + position);
                break;
            case 10:
                position = "Playmaker";
                System.out.println("Player position: " + position);
                break;
            default:
                System.out.println("Player position not known");
                break;
        }

        // Task 8
        if (age >= 20 && age  <= 30){
            if (weight_kg < 80) {
                System.out.println("Welcome to the Starting XI");
            }

            else {
                System.out.println(("Tap bench"));
            }
        }

        else {
            System.out.println(("Tap bench"));
        }

        //Task 9
        String final_eligibility = eligible ? "Play" : "Rest";
        System.out.println(final_eligibility);

    }
}

