import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Prosty kalkulator obslugujacy operacje +, -, *, /");
        

        System.out.print("Podaj pierwszą liczbe: ");
        double pierwszaLiczba = scanner.nextDouble();

        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);
        
        System.out.print("Podaj drugą liczbe: ");
        double drugaLiczba = scanner.nextDouble();
        
        double wynik = 0;
        boolean poprawnaOperacja = true;
        
        switch (operacja) {
            case '+':
                wynik = pierwszaLiczba + drugaLiczba;
                break;
            case '-':
                wynik = pierwszaLiczba - drugaLiczba;
                break;
            case '*':
                wynik = pierwszaLiczba * drugaLiczba;
                break;
            case '/':
                if (drugaLiczba != 0) {
                    wynik = pierwszaLiczba / drugaLiczba;
                } else {
                    System.out.println("Blad: dzielenie przez zero");
                    poprawnaOperacja = false;
                }
                break;
            default:
                System.out.println("Blad: nieprawidłowy symbol operacji");
                poprawnaOperacja = false;
        }
        
        if (poprawnaOperacja) {
            System.out.println("Wynik: " + wynik);
        }
 
        System.out.println("Nacisnij Enter, aby zakonczyc");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        scanner.close();
    }
}
