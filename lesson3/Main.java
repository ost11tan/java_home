import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/*1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел. Удалить из первого списка элементы отсутствующие во втором списке. Отсортировать первый список методом sort класса Collections.
2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.*/

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = fillArray();
        ArrayList<Integer> array2 = fillArray();
        

        array1.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1){
                return t0-t1;
            }
        });

        array2.sort(new Comparator<Integer>() {
            public int compare(Integer t0, Integer t1){
                return t1-t0;
            }
        });
        System.out.println(" ");
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(" ");
        array1.retainAll(array2);
        System.out.println(array1);

    }

    private static ArrayList fillArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int index = 0; index < 20; index++) {
            arrayList.add(rnd.nextInt(0, 51));
        }
        System.out.println(arrayList);
        return arrayList;
    }

}