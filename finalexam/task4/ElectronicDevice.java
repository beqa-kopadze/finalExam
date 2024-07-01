package finalexam.task4;

public class ElectronicDevice {
    private String name;
    private String model;
    private String serialNumber;

    public ElectronicDevice(String name, String model, String serialNumber) {
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ElectronicDevice that = (ElectronicDevice) obj;

        return serialNumber.equals(that.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber.hashCode();
    }
}
