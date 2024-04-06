package main;

public class IncludedMax extends Max {

    public IncludedMax(int value) {
        super(value);
    }

    public boolean isIncluded(double value) {
        return this.value >= value;
    }

}