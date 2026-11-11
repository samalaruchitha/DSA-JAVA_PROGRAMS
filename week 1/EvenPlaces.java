import java.util.Scanner;

public class EvenPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int pos = 1;

        while (n > 0) {
            int rem = n % 10;

            if (pos % 2 == 0) {
                sum = sum + rem;
            }

            n = n / 10;
            pos++;
        }

        System.out.println(sum);
        
        sc.close();
    }
}


