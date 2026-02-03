class Car {
    private int speed; 

    public int getSpeed() { 
        return speed;
    }

    public void setSpeed(int speed) { 
        this.speed = speed;
    }

    void checkSpeedLimit(int speedLimit) {
        if (this.speed <= speedLimit) {
            System.out.println("Safe: Maintain this speed (" + this.speed + ")");
        } else {
            System.out.println("Warning: You are exceeding the speed limit of " + speedLimit);
        }
    }
}

public class Code5 {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.setSpeed(220); 

        cr.checkSpeedLimit(210); 
    }
}
