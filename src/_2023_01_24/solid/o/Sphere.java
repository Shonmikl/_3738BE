package _2023_01_24.solid.o;

/**
 * Все геометрические объекты имеют набор размеров и метод getVolume (оба метода различны для каждого типа объекта).
 */
public class Sphere extends GeoObjects {
    public double radius;

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}