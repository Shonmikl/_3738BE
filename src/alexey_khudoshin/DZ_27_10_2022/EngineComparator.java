package alexey_khudoshin.DZ_27_10_2022;

import java.io.File;
import java.util.Comparator;

class PowerComparator implements Comparator<Motorcycles> {
    @Override
    public int compare(Motorcycles mot1, Motorcycles mot2) {
        return Integer.compare(mot1.getPower(), mot2.getPower());
    }

    class EngineVolumeComparator implements Comparator<Motorcycles> {
        @Override
        public int compare(Motorcycles mot1, Motorcycles mot2) {
            return Integer.compare(mot1.getEngineVolume(), mot2.getEngineVolume());
        }
    }

    class NameComparator implements Comparator<Motorcycles> {
        private File name;

        @Override
        public int compare(Motorcycles mot1, Motorcycles mot2) {
            return CharSequence.compare(mot1.getName(), mot2.getName());
        }
    }
}
