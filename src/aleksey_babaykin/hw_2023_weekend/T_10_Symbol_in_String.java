package aleksey_babaykin.hw_2023_weekend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_10_Symbol_in_String {

    public static void main(String[] args) {
        String r = "otiwuklf";
        String s = "";
        int index = -1;
        System.out.println("--> To exit : -1");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (!s.equals("-1")) {
            try {
                s = bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            index = r.indexOf(s);
            if (index != -1){
                System.out.println("Symbol position is :" + index);
            }else{
                System.out.println("There is not symbol :" + s);
            }
        }
    }
}
