package reviews.reviwes2;

public class review18 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if (!(i % 2 == 0)) {
                sum += i;
            }
            i++;
        }
        System.out.println("結果" +sum);
    }
}
