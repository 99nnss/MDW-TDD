package main;

public class Max {

    protected double value;

    public Max(double value) {
        this.value = value;
    }

    public boolean isIncluded(double value) {
        return this.value > value;
    }

}