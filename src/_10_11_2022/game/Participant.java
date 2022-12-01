package _10_11_2022.game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Participant {
    private String name;
    private int age;
}