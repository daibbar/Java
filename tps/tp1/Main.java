// package tps.tp1;
import java.util.Scanner;



public class Main {

    public static void Q2() {
        int i;

        i = -3;
        while (true){
            System.out.println(i*i);
            if (i <= 3) {
                i++;
                continue;
            }
            else break;
        }
    }

    public static void Q1() {
        int     valeurs;
        double  currentValue;
        Scanner scanner;

        scanner = new Scanner(System.in);
        valeurs = 0;
        while(true){
            System.out.println("enter the next number: ");
            currentValue = scanner.nextDouble();
            if(currentValue == 0) break;
            valeurs += (int)currentValue;
        }
        System.out.println(valeurs);
    }

    public static void Q3() {
        for(int i = 0; i <= 10; i+= 2){
            System.out.printf("racine de %d, %f\n", i, Math.sqrt(i));
        }
    }

    public static void Q4() {
        Scanner scanner = new Scanner(System.in);
        int nbr;
        int factor;

        nbr = scanner.nextInt();
        if (nbr == 0){
            System.out.printf("0! = 1\n");
        }

        factor = 1;
        for (int i = 1; i <= nbr; i++){
            factor *= i;
        }
        System.out.printf("%d! = %d\n", nbr, factor);

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int question;

        System.out.printf("choisir une questtttttttion");
        question = scanner.nextInt();
        switch (question){
            case 1:
                Q1();
                break;
            case 2:
                Q2();
                break;
            case 3:
                Q3();
                break;
            case 4:
                Q4();
                break;
        }

    }
}