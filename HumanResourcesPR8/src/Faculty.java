



 class Faculty extends Employee {
    
   // private String hours;
   // private String rank;
    
    public static String LECTURER = "Lecturer";
    public static String ASSISTANT_PROFESSOR = "Assistant Professor";
    public static String ASSOCIATE_PROFESSOR = "Associate Professor";
    public static String PROFESSOR = "Professor";

    protected String officeHours;
    protected String rank;
    
   
    public Faculty(String name, String officeHours, String rank, int office, int Salary, MyDate dateHired) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
  
    public String toString() {
        return "Name: " + getName() + " Class: " + getRank();
    }
    
    
}
