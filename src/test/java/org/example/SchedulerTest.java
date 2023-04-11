package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchedulerTest {

    @Test
    void mainTest() {
        Scheduler.main(null);
    }

    @Test
    void noArgsTest() {
        Scheduler.main(new String[]{});
    }

    @Test
    void printerTest(){
        Scheduler.main(new String[]{"понедельник"});
    }

    @Test
    void noDeviceTest(){
        Scheduler.main(new String[]{"вторник"});
    }

    @Test
    void faxTest(){
        Scheduler.main(new String[]{"пятница"});
    }
}