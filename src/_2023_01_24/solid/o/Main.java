package _2023_01_24.solid.o;


public class Main {
    public static void main(String args[]) {

        Cuboid cb1 = new Cuboid();

        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;


        Cuboid cb2 = new Cuboid();
        cb2.length = 3;
        cb2.breadth = 12;
        cb2.height = 15;

        Sphere sp1 = new Sphere();
        sp1.radius = 5;

        Sphere sp2 = new Sphere();
        sp2.radius = 2;

        GeoObjects[] geoObjects = new GeoObjects[6];

        // Setting Geo_objects to cuboid class
        geoObjects[0] = cb1;
        geoObjects[1] = cb2;

        // Setting Geo_objects to sphere class
        geoObjects[2] = sp1;
        geoObjects[3] = sp2;

        Application app = new Application();

        double vol = app.getTotalVolume(geoObjects);

        System.out.println("The total volume is " + vol);
    }
}