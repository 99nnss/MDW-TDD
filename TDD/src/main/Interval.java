package main;

public class Interval {

    private double min,max;

    public Interval(boolean minOpen, double min, boolean maxOpen, double max) {
        assert min <= max;
        this.max = max;
        this.min = min;
    }

    public boolean include(double value) {
        return this.min <= value && value <= this.max;
    }

}