package reviews.reviwes3;
import java.io.*;
public class review29_2 {
    public String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        try {
            inputStr = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputStr;
    }
}
