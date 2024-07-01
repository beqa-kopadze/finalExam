package finalexam.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicsStore implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<ElectronicDevice> devices = new ArrayList<>();

    public ElectronicsStore(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addDevice(ElectronicDevice device) {
        for (ElectronicDevice d : devices) {
            if (d.equals(device)) {
                System.out.println("The device is already in the store!");
                return;
            }
        }
        devices.add(device);
        System.out.println("Device: " + device.getName() + " " + device.getModel() + " with serial number: " + device.getSerialNumber() + " has been added to the store!");
    }

    public boolean deleteDevice(ElectronicDevice device) {
        boolean deviceDeleted = false;

        Iterator<ElectronicDevice> iterator = devices.iterator();
        while (iterator.hasNext()) {
            ElectronicDevice d = iterator.next();
            if (d.equals(device)) {
                iterator.remove();
                System.out.println("Device: " + device.getName() + " " + device.getModel() + " with serial number: " + device.getSerialNumber() + " has been removed from the store!");
                deviceDeleted = true;
            }
        }

        if (!deviceDeleted) {
            System.out.println("The device you want to remove is not in the store!");
        }

        return deviceDeleted;
    }

    public boolean deleteDevice(String serialNumber) {
        boolean deviceDeleted = false;

        Iterator<ElectronicDevice> iterator = devices.iterator();
        while (iterator.hasNext()) {
            ElectronicDevice device = iterator.next();
            if (device.getSerialNumber().equals(serialNumber)) {
                iterator.remove();
                System.out.println("Device: " + device.getName() + " " + device.getModel() + " with serial number: " + device.getSerialNumber() + " has been removed from the store!");
                deviceDeleted = true;
            }
        }

        if (!deviceDeleted) {
            System.out.println("The device you want to remove is not in the store!");
        }

        return deviceDeleted;
    }

    public void deviceList() {
        for (ElectronicDevice device : devices) {
            System.out.println("Device: " + device.getName() + " " + device.getModel() + " with serial number: " + device.getSerialNumber());
        }
    }

    public int deviceCount() {
        int size = devices.size();
        System.out.println("There are " + size + " devices in the store!");
        return size;
    }

    @Override
    public String toString() {
        return "This is an electronics store!";
    }
}
