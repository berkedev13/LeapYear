import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır!");
                } else {
                    System.out.println(year + " bir artık yıldır değildir!");
                }
            } else {
                System.out.println(year + " bir artık yıldır!");
            }
        } else {
            System.out.println(year + " bir artık yıldır değildir!");
        }
    }
}
