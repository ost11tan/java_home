/*1.Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке)..*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        StringBuilder sb1= new StringBuilder();
        sb1.append(str1);

        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        StringBuilder sb2= new StringBuilder();
        sb2.append(str2);
        
        System.out.println("Является ли вторая строка вхождением в первую?");
        task1(str1, str2);
        System.out.println("Являются ли две данные строки вращением друг друга?");
        task2(str1,sb2);
    }
    private static void task1(String str1,String str2){
        System.out.println(str1.contains(str2));
    }
    
    private static void task2(String str1,StringBuilder sb2){
        sb2.reverse();
        sb2.toString();
        System.out.println(str1.contains(sb2));
    }
    

}