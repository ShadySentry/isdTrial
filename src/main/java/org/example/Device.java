package org.example;

abstract class Device implements DeviceType {
    private String header;

    public abstract void sendMessage(String message);

    public Device(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (getHeader() != null ? !getHeader().equals(device.getHeader()) : device.getHeader() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return getHeader() != null ? getHeader().hashCode() : 0;
    }
}
