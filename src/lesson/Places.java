package lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Places implements Comparable<Places> {
    private String name;
    private double time;
    private int priority;

    public Places() {
    }

    public Places(String name, double time, int priority) {
        this.name = name;
        this.time = time;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Places places = (Places) o;
        return Double.compare(places.time, time) == 0 && priority == places.priority && Objects.equals(name, places.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time, priority);
    }

    @Override
    public String toString() {
        return name +
                " Время = " + time + " ч." + " Важность: " +
                priority;
    }

    @Override
    public int compareTo(Places o) {
        return o.getPriority() - this.getPriority();
    }

    public List<Places> getListOfPlaceInDay(List<Places> placesList) {
        List<Places> placesInFirstDay = new ArrayList<>();
        double countTime = 0;
        int i = 0;
        while (countTime <= 16 && i < placesList.size()) {

            if (placesList.get(i).getTime() + countTime > 16) {
                i++;
                continue;
            }
            placesInFirstDay.add(placesList.get(i));
            countTime += placesList.get(i).getTime();
            i++;
        }
        return placesInFirstDay;
    }

}
