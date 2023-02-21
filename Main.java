import java.util.Scanner;

public class Main {
    public static int cikarma(int a, int b){
        return (a - b);
    }
    public static double bolme(double a , double b) {
        return ((double) (a / b));

    }
    public static int toplama(int a , int b){
        return (a + b);
    }
    public static int toplama(int a , int b, int c){
        return (a + b + c);
    }
    public static int carpma(int a ,int b){
        return (a * b);
    }
    public static int carpma(int a, int b, int c){
        return (a * b * c);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String islemler = "1. Toplama işlemi\n"
                        + "2. Çarpma işlemi\n"
                        + "3. Çıkarma işlemi\n"
                        + "4. Bölme işlemi\n"
                        + "Çıkmak için q'ya basınız.";
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");

        while (true) {

            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Kaç sayıyıla toplama yapmak istiyorsunuz ? (2 veya 3)");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Toplam = " + toplama(a, b));
                }
                else if (kacsayi == 3) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    System.out.print("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Toplam = " + toplama(a, b, c));

                }
                else {

                    System.out.println("Hatalı işlem.");
                    break;
                }

            }
            else if (islem.equals("2")) {
                System.out.println("Kaç sayıyla çarpma yapmak istiyorsunuz (2 veya 3)");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sonuç = " + carpma(a, b));
                }
                else if (kacsayi == 3) {
                    System.out.print("a : ");
                    int a = scanner.nextInt();
                    System.out.print("b : ");
                    int b = scanner.nextInt();
                    System.out.print("c : ");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sonuç = " + carpma(a, b, c));
                }
                else {
                    System.out.println("Hatalı işlem.");
                    break;
                }
            }
            else if (islem.equals("3")) {
                System.out.println("Çıkarmak istdiğiniz sayıları giriniz.");
                System.out.print("a : ");
                int a = scanner.nextInt();
                System.out.print("b : ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sonuç = " + cikarma(a, b));
            }

            if (islem.equals("4")){
                System.out.println("Bölmek istediğiniz sayıları giriniz.");
                System.out.print("a : ");
                double a = scanner.nextDouble();
                System.out.print("b : ");
                double b = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Sonuç = " + bolme(a,b));
            }
        }
    }
}
//erdemacar6
