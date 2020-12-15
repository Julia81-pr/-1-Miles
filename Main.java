import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость билета:");
        int priceTicket = sc.nextInt();
        int costOneMile = 20;
        int gotMiles = priceTicket/ costOneMile;
        System.out.println("Полученные мили: " + gotMiles);
    }
}
