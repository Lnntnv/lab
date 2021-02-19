import java.io.*;
public class Main {
    FileOutputStream out = new FileOutputStream("c://temp//testFile2.txt");
    int countDown = 200;
        while (countDown >= 0) {

        public static void main(String args[]){
            int a = 0; // Начальное значение диапазона - "от"
            int b = 10000; // Конечное значение диапазона - "до"

            int random_number = a + (int) (Math.random() * b); // Генерация числа
            out.write(random_number());
            countDown --;
        }
    }
        <span>out.close();


    public class FileRead{
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            File f = new File("c://temp//testFile2.txt");
            BufferedReader fin = new BufferedReader(new FileReader(f));
            String name;
            String line;
            System.out.println("Print File "+f.getName()+"? y/n");
            name = br.readLine();
            if(name.equals("y"))
                while ((line = fin.readLine()) != null) System.out.println(line);
        }
    }
}