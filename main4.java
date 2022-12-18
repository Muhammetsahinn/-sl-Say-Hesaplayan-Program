import java.util.Scanner;

public class main4 {
    public static void main(String[] args){
        int a,b,toplam=1;
        Scanner grs = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        a=grs.nextInt();
        System.out.print("Hesaplanacak kati giriniz : ");
        b=grs.nextInt();
        for(int i=1;i<=b;i++){
            toplam=toplam*a;
        }
        System.out.print(toplam);

    }
}
