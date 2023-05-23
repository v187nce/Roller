public class Student {
    private String schoolClass;
    private String school;
    private String lk;
    
    public Student(int age,int height,String sex, String schoolClass,String school,String lk){
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
