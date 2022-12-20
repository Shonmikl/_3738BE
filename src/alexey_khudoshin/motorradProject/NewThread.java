package motorradProject;

public class NewThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Многопоточно я начал думать: что здесь можно придумать для Мото...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Многопоточно. Как ни странно: еще не придумал");
    }
}
