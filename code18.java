class Library {
    private String title;
    private boolean isAvailable = true; 

    public String getTitle() { 
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) { 
        this.isAvailable = available;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed: " + this.title);
        } else {
            System.out.println("Sorry! '" + this.title + "' is already borrowed.");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You returned: " + this.title);
        } else {
            System.out.println("The book '" + this.title + "' was already in the library.");
        }
    }
}

public class code18 {
    public static void main(String[] args) {
        Library b1 = new Library();
        b1.setTitle("Java Programming");
        
        b1.borrowBook(); 
        b1.returnBook();
        b1.borrowBook(); 
        b1.borrowBook(); d
    }
}
