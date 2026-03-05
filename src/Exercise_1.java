import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choose;
        do{
            System.out.print("Nhap so nguyen a: ");
            int a = scanner.nextInt();
            System.out.print("Nhap so nguyen b: ");
            int b = scanner.nextInt();
            System.out.println("1.tinh giai thua\n" +
                    "2.Tinh tong 2 so\n" +
                    "3.Tinh tich 2 so\n" +
                    "4.Tinh hieu 2 so\n" +
                    "5.Tinh thuong 2 so\n" +
                    "other. Exit");
            System.out.println("Nhap phuong thuc ");
            choose = scanner.nextInt();
            switch(choose) {
                case 1:
                    if (a < 0 || b < 0) {
                        System.out.println("So nguyen hoac so giai thua khong hop le");
                    } else {
                        int sumA = 1;
                        int sumB = 1;
                        for (int i = 1; i <= a; i++) {
                            sumA *= i;
                        }
                        for (int i = 1; i <= b; i++) {
                            sumB *= i;
                        }
                        System.out.println("Tong so giai thua a: " + sumA);
                        System.out.println("Tong so giai thua b: " + sumB);
                    }
                    break;
                case 2:
                    if (a < 0 || b < 0) {
                        System.out.println("So nguyen a hoac b khong hop le");
                    } else {
                        int sumAB = a + b;
                        System.out.println("Tong so a + b = " + sumAB);
                    }
                    ;
                    break;
                case 3:
                    if (a < 0 || b < 0) {
                        System.out.println("So nguyen a hoac b khong hop le");
                    } else {
                        int sumAB = a * b;
                        System.out.println("Tich so a * b = " + sumAB);
                    }
                    ;
                    break;
                case 4:
                    if (a < 0 || b < 0) {
                        System.out.println("So nguyen a hoac b khong hop le");
                    } else {
                        int sumAB = a - b;
                        System.out.println("Hieu so a - b = " + sumAB);
                    }
                    ;
                    break;
                case 5:
                    if (a < 0 || b <= 0) {
                        System.out.println("So nguyen a hoac b khong hop le");
                    } else {
                        int sumAB = a / b;
                        System.out.println("Thuong so a / b = " + sumAB);
                    }
                    ;
                    break;
                default:
                    System.out.println("Exit");
            }
        } while(choose >= 1 && choose <= 5);
        scanner.close();
    }
}