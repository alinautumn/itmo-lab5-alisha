package com.alisha.data;

import java.util.Objects;

public class Location {
    private final Double x; //Поле не может быть null
    private final Double y; //Поле не может быть null
    private final String name; //Строка не может быть пустой, Поле не может быть null


    public Location(Double x, Double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Location location = (Location) o;
        return Double.compare(location.x, x) == 0 && Objects.equals(y, location.y) && Objects.equals(name, location.name);
    }

    @Override
    public String toString() {
        return "Location{"
                + "x=" + x
                + ", y=" + y
                + ", name='" + name + '\''
                + '}';
    }
}
