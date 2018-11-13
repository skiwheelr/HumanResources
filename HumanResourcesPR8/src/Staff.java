


public class Staff extends Employee {
    //private String title;
    
    
    protected String title;

    public Staff(String name) {
        this(name, "none");

    }

    public Staff(String name, String title) {
        super.setName(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }
}