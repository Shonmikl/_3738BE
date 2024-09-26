package aleksey_babaykin.hw_2023_weekend;

import java.util.stream.Stream;

public class T_2_Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibonachi1(8));
        System.out.println(fibonachi2(8));
        System.out.println(fibonachi3(8));
    }
    public static int fibonachi1(int number){
        int fibo1 = 0;
        int fibo2 = 0;
        for(int i=1; i < number; i++){
            if(i==1){
                fibo2 = 1;
            }else{
                fibo2 = fibo2 + fibo1;
                fibo1 = fibo2 - fibo1;
            }
        }
        return fibo2;
    }
    public static int fibonachi2(int number){

        if(number <= 1){
            return 0;
        } else if(number == 2){
            return 1;
        } else {
            return fibonachi2(number - 1) + fibonachi2(number - 2);
        }
    }
    public static int fibonachi3(int number) {
        number = number - 2;
        return Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
                .limit(number)
                .map(y -> y[0])
                .mapToInt(Integer::intValue)
                .sum();
    }
}