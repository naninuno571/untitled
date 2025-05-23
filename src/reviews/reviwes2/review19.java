package reviews.reviwes2;

public class review19 {
    public static void main(String[] args) {
        int num = 10;
        int i = 0;
        int factorial = 1;
        while (num > i) {
            factorial = factorial *(num - i);
            i ++;
        }
        System.out.println("結果"+factorial);
    }
}
