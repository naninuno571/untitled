package reviews.reviwes2;

public class review23 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 1;
        for (int i = 0; i < num; i++) {
            sum *= num - i;
        }
        System.out.println("結果"+sum);
    }
}
