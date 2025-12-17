import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

public class MyWorkoutPal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //  date & time 
        LocalDateTime now = LocalDateTime.now();
        DayOfWeek today = now.getDayOfWeek();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy - hh:mm a");

        System.out.println("=================================");
        System.out.println("        MyWorkoutPal App");
        System.out.println(" Personalized Workout Generator");
        System.out.println("=================================");
        System.out.println("Today is: " + now.format(formatter));
        System.out.println("Workout Day: " + today + "\n");

        // ===== User Info
        System.out.print("Enter your body weight (lbs): ");
        int weight = input.nextInt();
        input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        // valid email loop
        String email;
        while (true) {
            System.out.print("Enter your email: ");
            email = input.nextLine();
            if (email.contains("@")) {
                break; // valid email
            } else {
                System.out.println("Invalid email. Please include an '@' symbol.");
            }
        }

        System.out.print("What is your main goal (fat loss, muscle, strength)? ");
        String goal = input.nextLine();

        System.out.print("What equipment do you have (bodyweight, dumbbells, gym)? ");
        String equipment = input.nextLine();

        //  training days and session length
        int daysPerWeek;
        int sessionLength;
        if (goal.equalsIgnoreCase("fat loss")) {
            daysPerWeek = 4;
            sessionLength = 40;
        } else if (goal.equalsIgnoreCase("muscle")) {
            daysPerWeek = 5;
            sessionLength = 60;
        } else {
            daysPerWeek = 3;
            sessionLength = 55;
        }

        System.out.println("\n=== TRAINING PLAN OVERVIEW ===");
        System.out.println("Recommended training days: " + daysPerWeek);
        System.out.println("Session length: " + sessionLength + " minutes");

        // water intake gal/oz
        double waterOunces = sessionLength * 0.5;
        double waterGallons = waterOunces / 128;
        System.out.printf("Recommended water intake: %.0f oz (%.2f gallons) per day\n", waterOunces, waterGallons);

        // 7 day sched
        String[] weekDays = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        String[] focusPool = {"Cardio & Abs", "Upper Body Push", "Glutes & Hamstrings", "Back & Biceps", "Full Body Conditioning"};

        // even wo days
        boolean[] isWorkoutDay = new boolean[7];
        int interval = 7 / daysPerWeek;
        int count = 0;
        for (int i = 0; i < 7 && count < daysPerWeek; i += interval) {
            isWorkoutDay[i] = true;
            count++;
        }

        String[] weekFocus = new String[7];
        int focusIndex = 0;
        for (int i = 0; i < 7; i++) {
            if (isWorkoutDay[i]) {
                weekFocus[i] = focusPool[focusIndex % focusPool.length];
                focusIndex++;
            } else {
                weekFocus[i] = "Rest Day";
            }
        }

        // weekly sched
        System.out.println("\n=== WEEKLY WORKOUT SCHEDULE ===");
        for (int i = 0; i < 7; i++) {
            if (weekFocus[i].equals("Rest Day")) {
                System.out.println(weekDays[i] + ": Active recovery / light stretching");
            } else {
                System.out.println(weekDays[i] + ": " + weekFocus[i]);
            }
        }

        // workout 4 the day
        int todayIndex = -1;
        for (int i = 0; i < 7; i++) {
            if (weekDays[i].equals(today.toString())) {
                todayIndex = i;
                break;
            }
        }

        String todaysFocus = weekFocus[todayIndex];
        System.out.println("\n=== TODAY'S WORKOUT ===");
        if (todaysFocus.equals("Rest Day")) {
            System.out.println("Today is a rest day. Light stretching recommended.");
        } else {
            System.out.println("Focus Area: " + todaysFocus);
            System.out.println("\nWarm-ups & dynamic stretches:");
            String[] warmups = {"5 min light cardio", "Arm circles", "Leg swings", "Torso twists"};
            for (String w : warmups) {
                System.out.println("- " + w);
            }
        }

        // exercises
        String[] exercises = new String[0];
        if (todaysFocus.equals("Cardio & Abs")) {
            exercises = new String[]{"Jump Rope", "Mountain Climbers", "Plank Hold"};
        } else if (todaysFocus.equals("Glutes & Hamstrings")) {
            exercises = equipment.equalsIgnoreCase("bodyweight")
                    ? new String[]{"Squats", "Glute Bridges", "Reverse Lunges"}
                    : new String[]{"Goblet Squats", "Romanian Deadlifts", "Step-Ups"};
        } else if (todaysFocus.equals("Back & Biceps")) {
            exercises = equipment.equalsIgnoreCase("gym")
                    ? new String[]{"Lat Pulldown", "Seated Row", "Bicep Curls"}
                    : new String[]{"Dumbbell Rows", "Hammer Curls", "Reverse Flys"};
        } else if (todaysFocus.equals("Upper Body Push")) {
            exercises = new String[]{"Push-ups", "Shoulder Press", "Chest Press"};
        } else if (todaysFocus.equals("Full Body Conditioning")) {
            exercises = new String[]{"Burpees", "Thrusters", "Farmer Carries"};
        }

        if (!todaysFocus.equals("Rest Day")) {
            System.out.println("\nExercises:");
            for (int i = 0; i < exercises.length; i++) {
                int reps = 8 + rand.nextInt(6);
                System.out.println("- " + exercises[i] + ": 3 sets x " + reps + " reps (Rest 60s)");
            }
        }

        // fake analytics
        System.out.println("\n=== WORKOUT ANALYTICS (Beta) ===");
        int caloriesBurned = sessionLength * (4 + rand.nextInt(4));
        int volumeScore = repsSafe(weight) * Math.max(1, exercises.length);
        System.out.println("Estimated Calories Burned: " + caloriesBurned + " kcal");
        System.out.println("Workout Volume Score: " + volumeScore);

        //  signup 4 premium waitlist
        System.out.println("\n=== PREMIUM MEMBERSHIP ===");
        System.out.println("Advanced personalization, analytics, unlimited history,");
        System.out.println("and live classes: Pilates, Barre, HIIT, Zumba");

        System.out.print("\nJoin the Premium waitlist? (yes/no): ");
        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("You're on the waitlist! Confirmation will be sent to: " + email);
        } else {
            System.out.println("No worries! You can join later anytime.");
        }

        // next wo day
        int nextIndex = todayIndex;
        do {
            nextIndex = (nextIndex + 1) % 7;
        } while (weekFocus[nextIndex].equals("Rest Day"));

        System.out.println("\nSee you at your next workout: " + weekDays[nextIndex] + " (" + weekFocus[nextIndex] + ")!");
        input.close();
    }

    // helper 4 fake analytics
    public static int repsSafe(int weight) {
        return weight > 200 ? 85 : 120;
    }
}

