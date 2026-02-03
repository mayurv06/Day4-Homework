class Voter {
    private int age;
    public int getAge() { 
        return age;
    }

   public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Error: " + age + " is not a valid age.");
        }
    }

    void checkEligibility() {
      if (age >= 18) {
            System.out.println("Status: Eligible to vote.");
        } else if (age > 0) {
            System.out.println("Status: Not eligible to vote (Minor).");
        } else {
            System.out.println("Status: Age not set or invalid.");
        }
    }
}

public class code20 { 
    public static void main(String[] args) {
        Voter vt = new Voter();
         vt.setAge(-5); 
        vt.setAge(15);
        vt.checkEligibility();
        vt.setAge(21);
        vt.checkEligibility();
    }
}
