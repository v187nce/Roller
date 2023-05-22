public class Human {
    private int height;
    private int age;
    private String sex;

    public Human(int height, int age, String sex){
        this.age = age;
        this.height = height;
        this.sex = sex;
    }
    public int getHeight(){
        return height;
    }
    public int getAge(){
        return  age;
    }
    public String getSex(){
        return sex;
    }
}
