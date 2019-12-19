package com.github.perschola.computer;

import org.junit.Test;

import java.util.Random;
import java.util.function.*;

/**
 * Created by leon on 12/19/2019.
 */
public class FunctionalInterfaceMethodReferenceTest {
    @Test
    public void test() {
        Runnable runnable = () -> System.out.println("The quick brown fox");
        Consumer<Object> consumer = System.out::println;
        BiConsumer<Integer, Integer> biConsumer = new String()::substring;
        Supplier<Double> supplier = new Random()::nextDouble;
        Function<String, Integer> function = Integer::parseInt;
        BiFunction<Integer, Integer, String> biFunction = new String()::substring;


        String result = biFunction.apply(0, 1);
        supplier.get();
        consumer.accept("The quick brown fox");
    }
}
