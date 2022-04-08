package cwiczenia2.zad1;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class vehicle{
        private String name;
        private LocalDate date;
        private List<Integer> wheels;

    public vehicle(String name, LocalDate date, List<Integer> wheels) {
        this.name = name;
        this.date = date;
        this.wheels = new ArrayList<>();
        this.wheels.add (wheel1, wheel2);
    }
}

