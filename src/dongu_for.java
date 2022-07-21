import java.util.Scanner;

public class dongu_for {
    public static void main(String[] args) {
        int n,j,k;
        j=1;
        k=0;
        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sınır Sayısı Seçiniz :");
        n=input.nextInt();

        for (int i=1;i<=n ;i *=3){
            System.out.println("3'ün "+k+" üssü =" + i);
            if (j <=n){
                System.out.println("4'ün "+k+" üssü = "+ j);
            }

            j *=4;
            k++;
        }
    }
}
