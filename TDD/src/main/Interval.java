package main;

public class Interval {

    private double min,max;
    private boolean maxOpen;

    public Interval(boolean minOpen, double min, boolean maxOpen, double max) {
        assert min <= max;
        this.maxOpen = maxOpen;
        this.max = max;
        this.min = min;
    }

    public boolean include(double value) {
        if (this.maxOpen){
            return this.min <= value && value < this.max;
        }
        return this.min <= value && value <= this.max;
    }

}