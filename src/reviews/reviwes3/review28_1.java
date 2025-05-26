package reviews.reviwes3;
import java.io.*;
public class review28_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("宛先を入力>");
        String to = br.readLine();
        System.out.print("件名を入力>");
        String subject = br.readLine();
        System.out.print("本文を入力>");
        String body = br.readLine();
         reveiw28_2 e = new reveiw28_2();
        if(subject.equals("")){
            e.send(to, body);
        } else {
            e.send(to, subject, body);
        }
    }
}

