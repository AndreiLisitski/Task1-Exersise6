import java.util.Scanner;

public class Task1Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[3];
        int max = mas[0];

        int sumMas = 0;
        for(int i = 0; i < mas.length; i++){
            mas[i] = sc.nextInt();
        }
        for(int i = 0; i < mas.length; i++) {
            System.out.print(" " + mas[i]);
        }
        System.out.println();

        for(int i = 0; i < mas.length; i++) {
            if(max < mas[i]) {
                max = mas[i];
            }
        }
        int min = mas[0];
        for(int i = 0; i < mas.length; i++) {
            if(min > mas[i]){
                min = mas[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        sumMas = max + min;
        System.out.println("Summ = " + sumMas);

        }

    }

