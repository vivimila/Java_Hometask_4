// 1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader.
// 2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. 
//   Разбить по строкам и вывести в консоль в формате "Иванов И.И. 32 М"
// 3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. 
//   Фамилии, имена, отчества, возрас и пол в отдельных списках.
// 4.Отсортировать по возрасту используя дополнительный список индексов.

import java.io.FileReader;
import java.io.IOException;

public class Program
{
    public static void main(String[] args) throws IOException
    {
        String str = " ";
        FileReader reader = new FileReader("db.sql");
        while (reader. ready ()) {
            str += (char) reader. read();
        }
        System.out.println(str);
        
    }
}

   