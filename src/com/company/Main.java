package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//	    // EX.1
        //zadanie: zsumować wszystkie liczby całkowite od 1 do 1000000
//        int i ;
//        long result = 0;
//
//        for(i = 1; i<1000000;i++){
//            result +=i;
//        }
//        System.out.println(result);
//
//        //EX.2
//        //zadanie: zsumować wszystkie liczby całkowite od 1 do 1000000


//        Scanner reader = new Scanner(System.in);  // Reading from System.in
//        int a,b,c;
//        System.out.println("Input please variables to check if You can make triangle out of them (a,b,c)");
//            a = reader.nextInt();
//            b = reader.nextInt();
//            c = reader.nextInt();
//
//
//        reader.close();
//
//        if(a+b>c && a+c>b && b+c>a){
//            System.out.println("That variables can form triangle");
//        }else{
//
//            System.out.println("this variables can't for a triangle");
//        }
        //EX.3
        //zadanie3: z liczb z przedziału [1..100] znaleźć takie a,b,c:
        //  a*a + b*b == c*c

//
//        int solution = 0;
//        int d, e;
//
//
//        for(d = 1 ; d<101; d++){
//            for(e=1;e<101;e++){
//                if( Math.sqrt(e*e+d*d) <= 100 && Math.sqrt(e*e+d*d)>1 ){
//                    solution +=1;
//                }
//            }
//
//        }
//        System.out.println(solution);

        //EX.4
        //zadanie4: obecny czas zadany jest w postaci dwóch liczb całkowitych,
        // hh (godzina) i mm (minuta); np. int hh=17; int mm=15 odpowiadają 17:15;
        // podany jest tez odcinek czasu `int delta`; jest to liczba minut,
        // które chcemy dodać do obecnego czasu; proszę wyliczyć
        // godzinę i minutę chwili powstałej po dodaniu `delta` do obecnego czasu.

        int h, m, delta, time;
        String minutes;

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Input numbers as follows : h, m, delta");
            h = reader.nextInt();
            m = reader.nextInt();
            delta = reader.nextInt();


        reader.close();
        time = h*60+m+delta;

        if(time%60<9){
            minutes = "0" + time%60;
        }else{
            minutes = Integer.toString(time%60);
        }

        System.out.println("It is: " + h + ":" + m + " in " + delta + "minutes it will be " +  time/60 + ":" + minutes);


    }
}
