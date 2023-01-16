//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//Пункты реализовать в методе main
//*Пункты реализовать в разных методах
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)


import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int i=task1();
        System.out.println("Результат выполнения задания 1 = "+i);
        System.out.println("Результат выполнения задания 2 = "+ task2(i));
        int n=task2(i);
        task3(i,n);
        task4(i,n);
        
    }
    private static int task1(){
        Random rnd = new Random();
        int i=rnd.nextInt(2000);
        return i;
    }
    private static int task2(int temp){
        String bin=Integer.toBinaryString(temp);
        int n= bin.length();     
        return n;
    }
    private static void task3(int i,int n){
        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) count++;
            }
        System.out.println("Количество элементов массива,полученного в задании 3 = "+count);
        int[] m1 = new int[count];

        int k=0;
        while(k < count) {
            for (int j = i; j < Short.MAX_VALUE; j++) {
                if (j%n == 0) 
                {
                    m1[k]=j ;
                    k++ ;
                }
                }
        }
        System.out.println("В диапазоне от "+i + " до " +Short.MAX_VALUE+" кратны "+n+":");
        for ( k = 0; k < count; k++) {
            System.out.print(String.valueOf(m1[k]) + ' ');
            }
    }
    private static void task4(int i,int n){
        int count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n != 0) count++;
            }
        System.out.println("Количество элементов массива,полученного в задании 4 = "+count);
        int[] m2 = new int[count];

        int k=0;
        while(k < count) {
            for (int j = Short.MIN_VALUE; j < i; j++) {
                if (j%n != 0) 
                {
                    m2[k]=j ;
                    k++ ;
                }
                }
        }
        System.out.println("В диапазоне от "+Short.MIN_VALUE + " до " +i+" некратны "+n+":");
        for ( k = 0; k < count; k++) {
            System.out.print(String.valueOf(m2[k]) + ' ');
            }
    }

}