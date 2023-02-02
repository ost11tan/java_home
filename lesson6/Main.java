import java.util.HashMap;

/*Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. Формат данных Integer.*/

public class Main {
    private static HashMap <Integer,Object> hMap = new HashMap<>();
    private static final  Object OBJECT = new Object();
    public static void main (String[] args) {
        add(1);
        add(5692);
        add(157);
        add(256743);

        Print();
        
}
public static void add(Integer numbers) {

    hMap.put(numbers, OBJECT);

}
public static void Print() {
    System.out.println(hMap.keySet());
}


}
