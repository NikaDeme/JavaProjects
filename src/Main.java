import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Hello ^_^ i will help you. Here are some questions I can answer :
                1. Where are your branches?
                2. What time do you work?
                3. How much is iPhone 13 costs?
                4. When will iPhone 14 add to sale?
                5. What will be Iphone 14 price?
                6. When can I buy Iphone 14?""");
        System.out.println("Enter Question Number :");
        int questName = scanner.nextInt();
        System.out.println("Your Question Number is :" + questName);

        if (questName == 1){
            System.out.println("""
                    Tbilisi, 5 S. Tsintsadze Str.
                    Tbilisi, 1 P. Kavtaradze Str.
                    Tbilisi, 37m I. Chavchavadze Ave.
                    13a Tamarashvili str. 0162""");
        } else if (questName == 2) {
            System.out.println("Everyday: 10:00 - 20:00");
        } else if (questName == 3){
            System.out.println("""
                    iPhone 13, 256 GB, Green - 3 399 GEL
                    iPhone 13 Pro, 128 GB, Alpine Green - 3 799 GEL
                    iPhone 13 Pro Max, 128 GB, Alpine Green - 4 199 GEL""");
        } else if (questName == 4){
            System.out.println("Iphone 14 will be added in 21 September");
        } else if (questName == 5){
            System.out.println("""
                    iPhone 14, 128 GB, (PRODUCT)RED - 3 339 GEL
                    iPhone 14 Plus, 128 GB, Midnight - 3 899 GEL
                    iPhone 14 Pro, 128 GB, Space Black - 4 199 GEL
                    iPhone 14 Pro Max, 128 GB, Space Black - 4 599 GEL""");
        } else if (questName == 6){
            System.out.println("You Can Pre-Order Today!");
        } else {
            System.out.println("You entered the wrong question number ! ! !");
        }
    }
}


