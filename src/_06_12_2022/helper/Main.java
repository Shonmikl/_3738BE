package _06_12_2022.helper;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alexey", "New York");
        Post post = new Post("New York");
        PostMan postMan = new PostMan("Mikhail");

        postMan.givePost(post, person);
    }
}
