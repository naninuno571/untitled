package katen.chapter2;
import java.util.Scanner;
public class practice_2_3 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = new Scanner(System.in).nextLine();
        System.out.print("あなたの年齢を入力してください>");
        String ageString = new Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);

        fortune++;
        System.out.println(age+"歳の"+name+"さん、あなたの運気番号は" + fortune + "です ");
        System.out.println("(1:大吉 2:中吉 3:吉 4:凶)");


    }
}
