// 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader.
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. 
//   Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. 
//   Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 4.Отсортировать по возрасту используя дополнительный список индексов.

import java.io.FileWriter;
import java.io.IOException;

public class Program
{
    public static void main(String[] args) throws IOException
    {
        String str = "Вывод строки с использованием классов FileWriter и FileReader";
        FileWriter fw=new FileWriter("output.txt");      // add a file to FileWriter
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
 
        System.out.println(str);
        fw.close();
    }
}