import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;

/*1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол в отдельных списках.
4.Отсортировать по возрасту используя дополнительный список индексов.*/

public class Main {
    public static void main(String[] args) {
        String str ="";
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();
        try {
            /*
             * FileWriter fileWriter = new FileWriter("bd.sql",true);
             * fileWriter.append("Hello word");
             * fileWriter.flush();
             */
            FileReader fileReader = new FileReader("bd.sql");
            while (fileReader.ready()) {
                str += (char) fileReader.read();
            }
            // System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] bd = str.split("\n");
        for (int i = 0; i < bd.length; i++) {
            index.add(i);
            String[] colomn = bd[i].split(" ");
            family.add(colomn[0]);
            name.add(colomn[1].charAt(0) + ".");
            soname.add(colomn[2].charAt(0) + ".");
            age.add(Integer.valueOf(colomn[3]));
            gender.add(colomn[4]);
            
        }
        for (int i = 0; i < index.size(); i++) {

            System.out.printf(family.get(index.get(i))+" ");
            System.out.printf(name.get(index.get(i)));
            System.out.printf(soname.get(index.get(i)));
            System.out.printf(" "+age.get(index.get(i)).toString());
            System.out.printf(" "+gender.get(index.get(i)));
            System.out.println();
        }

    }

}