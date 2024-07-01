package finalexam.task4;

public class StoreTester {

    public static void main(String[] args) {
        // Create the store
        ElectronicsStore store = new ElectronicsStore("123 Main St", "VAT123456");

        // Create some electronic devices
        ElectronicDevice device1 = new ElectronicDevice("Laptop", "Dell XPS 13", "SN123");
        ElectronicDevice device2 = new ElectronicDevice("Phone", "iPhone 12", "SN124");
        ElectronicDevice device3 = new ElectronicDevice("Tablet", "iPad Pro", "SN125");
        ElectronicDevice device4 = new ElectronicDevice("Smartwatch", "Apple Watch", "SN126");
        ElectronicDevice device5 = new ElectronicDevice("Camera", "Canon EOS", "SN127");

        // Add devices to the store
        store.addDevice(device1);
        store.addDevice(device2);
        store.addDevice(device3);
        store.addDevice(device4);
        store.addDevice(device5);
        store.addDevice(device1); // Attempt to add a duplicate

        // Print the current device list
        store.deviceList();

        // Print the number of devices
        store.deviceCount();

        // Delete a device by object
        store.deleteDevice(device2);

        // Delete a device by serial number
        store.deleteDevice("SN125");

        // Attempt to delete a device not in the store
        store.deleteDevice("SN129");

        // Print the final device list
        store.deviceList();

        // Print the final number of devices
        store.deviceCount();

        // Print the store description
        System.out.println(store.toString());
    }
}
