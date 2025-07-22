package de.leancoders.asego.common.model.device;

public enum EDeviceEarSide {
    LEFT("L"),
    RIGHT("R");

    private final String value;

    EDeviceEarSide(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
