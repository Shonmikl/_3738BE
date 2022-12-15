package _06_12_2022.helper;

import javax.sound.midi.Soundbank;

public class PostMan {
    String name;

    public PostMan(String name) {
        this.name = name;
    }

    void givePost(Post post, Person person) {
        if (post.address.equals(person.address)) {
            System.out.println("Postman had given a post to person: " + person.name);
        } else System.out.println("!!!");
    }
}
