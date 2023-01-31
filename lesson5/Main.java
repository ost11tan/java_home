import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/*Создать словарь HashMap. Обобщение <Integer, String>.Заменила на стринг тк у нас не числа
Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
Изменить значения сделав пол большой буквой.
Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
*Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.*/

public class Main {
    public static void main(String[] args) {


        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Фамилия","Иванов");
        hashMap.put("Имя", "Иван");
        hashMap.put("Отчество","Иванович" );
        hashMap.put("Возраст","28");
        hashMap.put("Пол","м");


        Collection<String> sValues = hashMap.values();
        Set<Map.Entry<String, String>> eSet = hashMap.entrySet();
        Set<String> keySet = hashMap.keySet();


        hashMap.compute("Пол", (k, v) -> v = v.toUpperCase());

        for (int i = 0; i < keySet.size(); i++) {
            if ( ((String)keySet.toArray()[i])== "Фамилия"){
                
            System.out.print(hashMap.get(keySet.toArray()[i])+" ");

        }
    }
    for (int i = 0; i < keySet.size(); i++) {
        if (( ((String)keySet.toArray()[i])== "Имя") | ( ((String)keySet.toArray()[i])== "Отчество")){
                
            System.out.print(hashMap.get(keySet.toArray()[i]).charAt(0)+".");
    }
        


    
    
    }
}
}

