package aleksey_babaykin.project;

import aleksey_babaykin.project.util.InitLoad;

public class Main {
    public static void main(String[] args) {
        InitLoad.checkDir();
        InitLoad.createFile();
        InitLoad.loadTables();

    }
}
