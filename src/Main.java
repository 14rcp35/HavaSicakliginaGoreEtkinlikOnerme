import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sicaklik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık değerini derece cinsinden giriniz : ");
        sicaklik = scanner.nextInt();
        if (sicaklik<5){
            System.out.println("Kayak yapmak için uygun bir gün");
        }else if (sicaklik<=25){
            if(sicaklik<=15) {
                System.out.println("Sinemaya gitmek için uygun bir gün");
            }
            if(sicaklik>=10) {
                System.out.println("Piknik yapmak için uygun bir gün");
            }

        }else{
            System.out.println("Yüzmek için uygun bir gün");
        }
    }
}
