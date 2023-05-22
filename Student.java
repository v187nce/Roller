public class Student extends Human {
    private String schoolClass;
    private String school;
    private String lk;
    
    public Student(int age,int height,String sex, String schoolClass,String school,String lk){
        super(height, age, sex);
        this.schoolClass = schoolClass;
        this.school = school;
        this.lk = lk;
    }
    public String getSchoolClass(){
        return schoolClass;
    }
    public String getSchool(){
        return school;
    }
    public String getLk(){
        return lk;
    }
}
