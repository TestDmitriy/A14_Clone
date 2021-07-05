package lesson11;

import java.util.Arrays;

public class Shuttle {
    private Engine engine;
    private LiveBlock liveBlock;
    private Person[]crew;

    public Shuttle(Engine engine, LiveBlock liveBlock, Person[] crew) {
        this.engine = engine;
        this.liveBlock = liveBlock;
        this.crew = crew;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public LiveBlock getLiveBlock() {
        return liveBlock;
    }

    public void setLiveBlock(LiveBlock liveBlock) {
        this.liveBlock = liveBlock;
    }

    public Person[] getCrew() {
        return crew;
    }

    public void setCrew(Person[] crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Shuttle{" +
                "engine=" + engine +
                ", liveBlock=" + liveBlock +
                ", crew=" + Arrays.toString(crew) +
                '}';
    }
}

