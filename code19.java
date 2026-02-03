class Temperature {
    private double celsius;

   
    public double getCelsius() {
        return celsius;
    }

   
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Error: Temperature cannot be below absolute zero (-273.15°C)!");
        }
    }

    void checkSafety() {
        if (celsius > 100) {
            System.out.println("Warning: Temperature is above boiling point!");
        } else if (celsius < 0) {
            System.out.println("Status: Temperature is below freezing point.");
        } else {
            System.out.println("Status: Temperature is within a normal range.");
        }
    }
}

public class Code19 { 
    public static void main(String[] args) {
        Temperature tp = new Temperature();
        tp.setCelsius(-300); 
        tp.setCelsius(12);
        tp.checkSafety();
    }
}
