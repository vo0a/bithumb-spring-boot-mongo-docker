package com.romkudev.api.customer.methodReference;

import com.mongodb.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorReferenceTest {

    @Test
    void main() {
        Function<Runnable, Thread> threadGenerator = Thread::new;
        Runnable t1 = () -> System.out.println("T1 executed");
        Runnable t2 = () -> System.out.println("T2 executed");
        Thread thread1 = threadGenerator.apply(t1);
        Thread thread2 = threadGenerator.apply(t2);

        thread1.start();
        thread2.start();

        threadGenerator
                .apply(() -> System.out.println("T3 executed"))
                .start();
    }
}