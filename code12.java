class Student {
    private String name;
    private double marks;

    // Use camelCase: getName instead of getname
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        // Logic fix: marks should be valid if they are 0 or greater
        if (marks >= 0) {
            this.marks = marks;
            System.out.println("Marks: " + marks);
        } else {
            System.out.println("Marks should be positive.");
        }
    }
}

public class code12 { // Class names should start with an Uppercase letter
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Mayur"); // Matches the updated camelCase method
        st.setMarks(35);
    }
}
    
    

