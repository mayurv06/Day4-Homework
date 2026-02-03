class Mobile {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid battery level. Must be between 0 and 100.");
        }
    }

    void checkStatus() {
        if (this.batteryLevel < 100) {
            System.out.println("Battery is at " + batteryLevel + "%. Charging...");
        } else {
            System.out.println("Battery is full (100%).");
        }
    }
}

public class code16 {
    public static void main(String[] args) {
        Mobile mb = new Mobile();
        mb.setBatteryLevel(99);
        mb.checkStatus();
        
        mb.setBatteryLevel(100);
        mb.checkStatus();
    }
}
