package org.example.day10.Constructor;

public class TV {
    int channel;
    int volume;
    boolean onOff;
    public TV(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }
}
