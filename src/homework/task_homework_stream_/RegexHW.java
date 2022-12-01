package homework.task_homework_stream_;


import java.util.regex.Pattern;

public class RegexHW {
    public RegexHW() {
    }

    void checkIp(String ip) {
        String regex = "^(((((0|1)[0-9][0-9])+.)|((2[0-4][0-9])+.)|((25[0-5])+.)){3})+(((0|1)[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))$";
        System.out.println(ip + " is OK " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "248.255.178.000";
        String ip2 = "255.255.255.255";
        String ip3 = "111.098.000.133";
        String ip4 = "555.098.000.133";
        RegexHW hw = new RegexHW();
        hw.checkIp(ip1);
        hw.checkIp(ip2);
        hw.checkIp(ip3);
        hw.checkIp(ip4);
    }
}
