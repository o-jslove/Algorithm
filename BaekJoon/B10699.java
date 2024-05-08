package baekjoon;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class B10699 {
	public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime seoulTime = now.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = seoulTime.format(formatter);

        System.out.println(formattedDate);
    }
}
