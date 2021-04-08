package com.temmy.enchantupgrades.CustomFunctions;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class WeightedRandomness<Double> {
    private final NavigableMap<java.lang.Double, Object> map = new TreeMap<java.lang.Double, Object>();
    private final Random random;
    private java.lang.Double total = java.lang.Double.valueOf(0);

    public WeightedRandomness(){
        this(new Random());
    }

    public WeightedRandomness(Random random){
        this.random = random;
    }

    public WeightedRandomness<Double> add (double weight, Double result){
        if (weight <= 0) return this;
        total += weight;
        map.put(total, result);
        return  this;
    }

    public Double next(){
        double value = random.nextDouble() * total;
        return (Double) map.higherEntry(value).getValue();
    }
}