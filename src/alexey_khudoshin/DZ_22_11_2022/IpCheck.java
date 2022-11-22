package alexey_khudoshin.DZ_22_11_2022;

import java.util.regex.Pattern;

public class IpCheck {

    //todo*
    String getCharCount(String s) {
        /**
         * s -> asdjklsdfkjhasd;lsdfh
         * [A2D3F1J2]
         * ЕСЛИ В СТРИНГЕ БУДЕТ ВСЕ ЧТО УГОДНО КРОМЕ БУКАВ, ТО НЕ ПРИНИМАТЬ ТАКУЮ СТРОКУ
         */
        return null;
    }

    void checkIp(String ip) {
        //todo
        String regex = "(\\d{3}[.]\\d{3}[.]\\d{3}[.]\\d{3})";
        System.out.println(ip + " is OK " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "255.255.255.255";
        IpCheck hw = new IpCheck();
        hw.checkIp(ip1);
    }
}
