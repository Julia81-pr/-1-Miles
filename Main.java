import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость билета:");
        int priceTicket = sc.nextInt();
        int miles = service.calculate(priceTicket,20);
        System.out.println("Полученные мили: " + miles);
    }
}

//
