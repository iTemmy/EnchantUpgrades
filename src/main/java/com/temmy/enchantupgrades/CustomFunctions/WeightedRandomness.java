package com.temmy.enchantupgrades.CustomFunctions;

import java.util.Random;
import java.util.TreeMap;

public class WeightedRandomness<T> {
    private final TreeMap<Double, T> map = new TreeMap<Double, T>();
    private final Random random;
    private double total = 0d;

    public WeightedRandomness(){
        this(new Random());
    }

    public WeightedRandomness(Random random){
        this.random = random;
    }

    public void add (double weight, T result){
        if (weight <= 0) return;
        total += weight;
        map.put(total, result);
    }

    public T next(){
        double value = random.nextDouble() * total;
        return map.higherEntry(value).getValue();
    }
}