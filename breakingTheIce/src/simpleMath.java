import java.util.Scanner;
class simpleMath {
    public static void main (String [] args) {
        System.out.println ("Ввести любе число від 1 до 10: ");
        Scanner scan = new Scanner (System.in) ;
        int number = scan.nextInt();
        System.out.println ("Ви ввели число: " + number);
    }
}
