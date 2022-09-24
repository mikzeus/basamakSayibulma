import java.util.Scanner;

public class basamakSayısı {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.println("bir Sayı giriniz:");
        int a= inp.nextInt();
        int basNumber=0;

        while (a!=0){
            a/=10;
            basNumber++;

        }
        System.out.println("Basamak Sayısı:" +basNumber);
    }
}
