package aleksey_babaykin.hw_20230124;

public class Task1FindElements {
    private int[] arrayInit;
    private int amount;
// it works only for array element >=0
    public static void main(String[] args) {
        Task1FindElements task = new Task1FindElements();
        task.initArray();
        System.out.println(task.calculate());
    }
    public void initArray() {
        arrayInit = new int[]{6, 1, 3, 4, 4, 2, 3, 1, 2, 3, 4, 5, 6, 1, 1, 1, 1, 7, 6, 5, 4, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 5, 6, 6, 8, 59, 59};
        amount = 17;
    }
    public int calculate() {
        int beginPosition = 0;
        int sumElements = 0;
        int minNumberOfElements = -1;
        for (int i = 0; i < arrayInit.length; i++) {
            sumElements += arrayInit[i];

            while ((sumElements >= amount || beginPosition > i) && beginPosition < arrayInit.length) {
                if (sumElements == amount) {
                    if (minNumberOfElements == -1 || minNumberOfElements > (i - beginPosition + 1)) {
                        minNumberOfElements = i - beginPosition + 1;
                    }
                }
                sumElements -= arrayInit[beginPosition];
                beginPosition++;

            }
        }
        return minNumberOfElements;
    }
}