package Easy;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) throws IOException {
        Date current = new Date();
        SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(date.format(current));

    }
}
