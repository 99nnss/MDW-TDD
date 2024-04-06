package main;

public class Interval {

    private double min,max;

    public Interval(double d, double e) {
        this.max = e;
        this.min = d;
    }

    public boolean include(double d) {
        return this.min <= d && d <= this.max;
    }

}