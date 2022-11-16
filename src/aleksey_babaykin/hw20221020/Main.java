package aleksey_babaykin.hw20221020;

public class Main {
    public static void main(String[] args) {

        Autorization autorization = new Autorization();
        autorization.setAutorizedLogin(new Login());

        DataBase dataBase = new DataBase();
        dataBase.getData();

        User user = new User("First Name", "Second Name", Status.ACTIVE, "email@gmail.com");
        user.insertUserDataToDB();
        user.toString();


    }
}
