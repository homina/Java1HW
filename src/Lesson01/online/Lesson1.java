package Lesson01.online;

public class Lesson1 {

    public static void main(String[] args) {
// Номер 1
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        float result = a * (b + ((float) c / d));
        System.out.println("Номер 1: " + result);
        System.out.println("Номер 2: " + checkNumbers(2, 17));
        System.out.println("Номер 3: " + ((isPositive(-5)) ? "positive" : "negative") + "!");
        if (isPositive(2)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        System.out.println("Номер 4: " + welcome("Nastea"));



    }
    // Номер 2
    public static boolean checkNumbers(int first,int second) {

        int sum = first + second;
        return (sum <= 20) && (sum >= 10);

    }
    
    // Номер 3
    public static boolean isPositive(int variable) {
        return variable >= 0;
    }

    // Номер 4
    public static String welcome(String name) {
        return "Privet, " + name + "!";
    }


}
