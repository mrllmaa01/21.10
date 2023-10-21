import java.util.Scanner;
public class zad1 {
    //Public - класс доступен для использования любым другим классом. Static - создает класс.Void - продукт не возвращается, когда класс завершает обработку.
    public static void main(String[] args){
        Scanner a = new Scanner (System.in);

        System.out.println("Введите любое слово:");

        String b = a.nextLine();
        System.out.println(b.substring( b.length()-1));
        //substring - раззбивает слова на множества

    }
}
