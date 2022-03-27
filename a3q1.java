import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class a3q1 {
    public static void main(String[] args) {
        DateTimeFormatter d= DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        LocalDateTime l=LocalDateTime.now();
        System.out.println(d.format(l));
    }
}
