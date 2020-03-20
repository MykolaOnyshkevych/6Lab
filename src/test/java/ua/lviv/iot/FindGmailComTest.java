package ua.lviv.iot;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.RegEx.FindMailServisesInText;;

public class FindGmailComTest {
    @Test
    public void test() {

        String text = "duma was working till i kill his Mom oops bbbopowpe@duma.co, gmail@g. dfuufu.ere@";
        InputStream in = new ByteArrayInputStream(text.getBytes());
        System.setIn(in);

        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        String textToCheck = myScanner.nextLine();
        System.out.println(textToCheck);
        FindMailServisesInText.findMailServerInText(textToCheck);
    }
    /*
     @Test
public void test() {
System.out.println(" Enter your Text ");
String textToCheck = FindMailServisesInText.scanString();
FindMailServisesInText.findMailServerInText(textToCheck);

     */
}