package aleksey_babaykin.hw20221122;

import java.util.regex.Pattern;

public class Task1RegExpIPAddress {
    void checkIp(String ip) {
        String regex = "(((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|([1-9]\\d)|(\\d))\\.){3}((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|([1-9]\\d)|(\\d))";
        System.out.println(ip + " is OK " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        Task1RegExpIPAddress hw = new Task1RegExpIPAddress();
        hw.checkIp("01.15.249.255");
        hw.checkIp("001.15.249.255");
        hw.checkIp("256.15.249.255");
        hw.checkIp("0.1.1.255");
        hw.checkIp("9.15.249.255");
        hw.checkIp("99.15.249.255");
        hw.checkIp("254.15.249.255");
    }
}