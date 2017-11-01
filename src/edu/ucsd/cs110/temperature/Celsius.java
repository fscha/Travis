package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {

    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = 32 + (this.getValue()*9)/5;
        return new Fahrenheit(value);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}
