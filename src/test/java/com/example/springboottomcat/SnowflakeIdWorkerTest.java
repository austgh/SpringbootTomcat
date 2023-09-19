package com.example.springboottomcat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SnowflakeIdWorkerTest {

    private SnowflakeIdWorker snowflakeIdWorkerUnderTest;

    @BeforeEach
    void setUp() {
        snowflakeIdWorkerUnderTest = new SnowflakeIdWorker(0L, 0L);
    }

    @Test
    void testNextId() {
        assertThat(snowflakeIdWorkerUnderTest.nextId()).isEqualTo(0L);
    }

    @Test
    void testTilNextMillis() {
        assertThat(snowflakeIdWorkerUnderTest.tilNextMillis(0L)).isEqualTo(0L);
    }

    @Test
    void testTimeGen() {
        assertThat(snowflakeIdWorkerUnderTest.timeGen()).isEqualTo(0L);
    }

    @Test
    void testGenerateId() {
        assertThat(SnowflakeIdWorker.generateId()).isEqualTo(0L);
    }

    @Test
    void testMain() {
        // Setup
        // Run the test
        SnowflakeIdWorker.main(new String[]{"args"});

        // Verify the results
    }
}
