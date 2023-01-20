/*4.Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59
 3 – 56 = -53 
 3 * 56 = 168 
 Используем метод StringBuilder.append().
5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
6.*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().*/

public class Main2 {
    public static void main(String[] args) {
        
        
        int num1 = 3;
        int num2 = 56;
        System.out.println(addition(num1, num2));
        
        System.out.println(subtraction(num1, num2));
        
        System.out.println(multiplication(num1, num2));

        System.out.println(replacement(addition(num1, num2)));

        System.out.println(replacement2(addition(num1, num2)));

        

    }
    private static StringBuilder addition(int num1,int num2){
        int num3=num1+num2;
        StringBuilder res= new StringBuilder();
        res.append(num1);
        res.append("+");
        res.append(num2);
        res.append("=");
        res.append(num3);
        return res;

    }
    
    private static StringBuilder subtraction(int num1,int num2){
        int num3=num1-num2;
        StringBuilder res= new StringBuilder();
        res.append(num1);
        res.append("-");
        res.append(num2);
        res.append("=");
        res.append(num3);
        return res;

    }
     
    private static StringBuilder multiplication(int num1,int num2){
        int num3=num1*num2;
        StringBuilder res= new StringBuilder();
        res.append(num1);
        res.append("*");
        res.append(num2);
        res.append("=");
        res.append(num3);
        return res;

    }
      
    private static StringBuilder replacement(StringBuilder res){
        String res1=res.toString();
        int index=res1.indexOf("=");
        res.replace(index,index+1, "равно");
        return res;


    }
    private static StringBuilder replacement2(StringBuilder res){
        String res1=res.toString();
        int index=res1.indexOf("=");
        res.deleteCharAt(index);
        res.insert(index,"равно");
        return res;


    }
}