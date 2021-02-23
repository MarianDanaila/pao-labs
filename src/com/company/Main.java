package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ex1
        int n = scanner.nextInt();
        System.out.println("Numerele pare: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {  // conditie de verificare a paritatii
                System.out.println(i);
            }
        }

        // Ex2
        // nu e nevoie de comentarii la acest exercitiu :)
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Numarul mai mare este: ");
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

        // Ex3
        n = scanner.nextInt();
        int fact = 1;
        for (int i = 2; i <= n; i++) { // inmultim toate numerele de la [2:n] pentru a afla factorialul
            fact *= i;
        };
        System.out.println("Factorialul lui n este: " + fact);
        // Ex4
        n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) { // multiplii ori de 3 ori de 5
                sum += i;
            }
        }
        System.out.println("Suma multiplilor de 3 si 5: " + sum);

        // Ex5
        n = scanner.nextInt();
        int pare[] = new int[n]; // vectorul in care vom tine elementele pare
        int impare[] = new int[n]; // vectorul in care vom tine elementele impare
        int i1 = 0, i2 = 0, nr;
        for (int i = 0; i < n; i++) {
            nr = scanner.nextInt();
            if (nr % 2 == 0){ // punem in vectorul de pare
                pare[i1] = nr;
                i1++;
            }
            else {  // punem in vectorul de impare
                impare[i2] = nr;
                i2++;
            }
        }

        // afisam vectorul de elemente pare
        System.out.println("Vectorul de elemente pare: ");
        for (int i = 0; i < i1; i++) {
            System.out.println(pare[i]);
        }
        // afisam vectorul de elemente impare
        System.out.println("Vectorul de elemente impare: ");
        for (int i = 0; i < i2; i++) {
            System.out.println(impare[i]);
        }


        // Ex6
        n = scanner.nextInt();
        int note[] = new int[n];
        int count = 0, totalSum = 0, nota;
        for (int i = 0; i < n; i++) { // citesc notele in vector
            nota = scanner.nextInt();
            if (nota == -1){
                System.out.println("Media este: " + totalSum/count); // afisam media atunci cand citim valoarea -1
                break;
            }
            note[i] = nota;
            count++; // numaram numarul de note
            totalSum += nota; // adunam notele
        }
        // Ex7
        n = scanner.nextInt();
        if (n == 1) { // daca n este primul numar din serie
            System.out.println(0);
        }
        else if (n == 2){ // daca n este al doilea numar din serie
            System.out.println(1);
        } else {
            int f1 = 0, f2 = 1, counter = 2, temp; // f2 va fi al n-lea numar
            while (counter <= n){
                temp = f2;
                f2 += f1;
                f1 = temp;
                counter++;
            }
            System.out.println("Al n-lea numar din seria Fibonacci: " + f2);
        }
    }
}