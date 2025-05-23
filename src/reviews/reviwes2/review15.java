package reviews.reviwes2;

public class review15 {
    public static void main(String[] args) {
        int num = 10;
        switch (num % 2) {
            case 0:
                System.out.println("偶数");
                break;
            case 1:
                System.out.println("奇数");
                break;
            default:
                System.out.println("無効な入力です");
                break;
        }
    }
}
