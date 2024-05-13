package Lesson4_OOP.StopWatch;

//         ___________________________
//        |        StopWatch         |
//        |--------------------------|
//        | - startTime: long        |
//        | - endTime: long          |
//        |--------------------------|
//        | + StopWatch()            |
//        | + getStartTime(): long   |
//        | + getEndTime(): long     |
//        | + start(): void          |
//        | + stop(): void           |
//        | + getElapsedTime(): long |
//        ---------------------------


import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = Instant.now().toEpochMilli();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime = Instant.now().toEpochMilli();
    }

    public void stop(){
        endTime = Instant.now().toEpochMilli();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
