package _06_12_2022.helper;

public class Person {
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void getPost(Post post) {
        System.out.println(post.address);
    }
}
