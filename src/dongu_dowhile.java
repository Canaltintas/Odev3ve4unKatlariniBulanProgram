import java.util.Scanner;

public class dongu_dowhile {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sınır Sayısı Seçiniz :");
        n=input.nextInt();

        i=1;
        j=1;
        k=0;
        do {
            System.out.println("3'ün "+k+" üssü =" + i);
            if (j <=n){
                System.out.println("4'ün "+k+" üssü = "+ j);
            }
            i *=3;
            j *=4;
            k++;
        }while (i <= n);

    }
}
