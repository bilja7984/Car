
package person;

public class Teacher extends Person {
    
    private String mainSubject;
    private int yearsOfExperience;
    private char gender;
    
    
    public Teacher (String name, String surname, String jmbg, String mainSubject, int yearsOfExperience, char gender) {
        super (name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.yearsOfExperience = yearsOfExperience;
        this.gender = gender;
    }
    
    public String getMainSubject() {
        return this.mainSubject;
    }
    
    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
    
    public int getYearsOfExperience () {
        return this.yearsOfExperience;
    }
    
    public void setYearsOfExperience (int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public char getGender () {
        return this.gender;
    }
    
    public void setGender (char gender) {
        this.gender = gender;
    }
    
    
    @Override
    public void showData() {
        
        System.out.println("Persons main subject is " + getMainSubject());
        System.out.println("Persons years of experience are " + getMainSubject()); 
        System.out.println("Persons gender is " + getGender());
        super.showData();
    }
    
    
}
