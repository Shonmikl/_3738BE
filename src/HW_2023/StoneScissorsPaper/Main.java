package HW_2023.StoneScissorsPaper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

import static HW_2023.StoneScissorsPaper.Person.whoWins;
import static java.lang.Thread.sleep;

@AllArgsConstructor
@Getter
@Setter
public class Main {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Person> gamers = new ArrayList<>();

        gamers.add(new Person("Александр Сапунов", Action.PAPER, 0, exchanger));
        gamers.add(new Person("Алексей Бабайкин", Action.PAPER, 0, exchanger));
        gamers.add(new Person("Алексей Лавров", Action.PAPER, 0, exchanger));
        gamers.add(new Person("Алексей Худошин", Action.PAPER, 0, exchanger));
        gamers.add(new Person("Ирина", Action.PAPER, 0, exchanger));
        gamers.add(new Person("Михаил", Action.PAPER, 0, exchanger));
        gamers.add(new Person("ИИ1", Action.PAPER, 0, exchanger));
        gamers.add(new Person("ИИ2", Action.PAPER, 0, exchanger));
        gamers.add(new Person("ИИ3", Action.PAPER, 0, exchanger));
        gamers.add(new Person("ИИ4", Action.PAPER, 0, exchanger));

        for (Person gamer : gamers) {
            System.out.println(gamer);
        }

        public void run () {
            Action action, reply;
            for (int i = 0; i < gamers.size(); i++) {
                for (int j = i + 1; j <= gamers.size(); j++) {
                    action = gamers.get(i).getAction();
                    reply = gamers.get(j).getAction();

                    try {
                        reply = exchanger.exchange(action);
                        whoWins(Action[]action, Action[]reply);
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }
            }
//            Здесь начинается эпическая музыка:
            try {
                File soundFile = new File("Tina_Turner_-_The_Best.mp3"); //Звуковой файл

                //Получаем AudioInputStream
                //Вот тут могут полететь IOException и UnsupportedAudioFileException
                AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

                //Получаем реализацию интерфейса Clip
                //Может выкинуть LineUnavailableException
                Clip clip = AudioSystem.getClip();

                //Загружаем наш звуковой поток в Clip
                //Может выкинуть IOException и LineUnavailableException
                clip.open(ais);

                clip.setFramePosition(0); //устанавливаем указатель на старт
                clip.start(); //Поехали!!!

                //Если не запущено других потоков, то стоит подождать, пока клип не закончится
                //В GUI-приложениях следующие 3 строчки не понадобятся
                Thread.sleep(clip.getMicrosecondLength()/1000);
                clip.stop(); //Останавливаем
                clip.close(); //Закрываем
            } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
                exc.printStackTrace();
            } catch (InterruptedException exc) {}

        }
    }

}

