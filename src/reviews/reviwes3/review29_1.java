package reviews.reviwes3;
public class review29_1 {
    public static void main(String[] args) {
        review29_2 obj = new review29_2();
        System.out.print("宛先を入力>");
        String to = obj.readString();
        System.out.print("件名を入力>");
        String subject = obj.readString();
        System.out.print("本文を入力>");
        String body = obj.readString();
        System.out.println(to+"に以下のメールに送信しました。");
        System.out.println("件名:"+subject);
        System.out.println("本文:"+body);
    }
}
