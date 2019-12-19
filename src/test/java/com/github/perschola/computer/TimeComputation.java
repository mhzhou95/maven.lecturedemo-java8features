package com.github.perschola.computer;

import com.github.perschola.Computer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 12/19/2019.
 */
public class TimeComputation {
    private void test(Runnable methodToBeTimed) {
        // given
        Long startTime = System.nanoTime();

        // when
        methodToBeTimed.run();

        // then
        Long endTime = System.nanoTime();
        Long delta = endTime - startTime;
        System.out.println("The method took " + delta + " nanoseconds to run");
    }

    @Test
    public void testLightComputation() {
        test(() -> Stream.of("The", "Quick", "Brown", "Fox")
                .filter(stringVal -> stringVal.startsWith("T"))
                .filter(stringVal -> 'h' == stringVal.charAt(1))
                .collect(Collectors.toList())
        );
    }

    @Test
    public void testHeavyComputation() {
        test(new Computer()::heavyComputation);
    }
}
