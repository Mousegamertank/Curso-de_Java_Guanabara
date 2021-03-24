package aula09b;

public class Pessoa {
    private String name;
    private int age;
    private String sex;

    //CONSTRUCTOR
    public Pessoa (){

    }
    public Pessoa (String name, int age, String sex){
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);

    }

    //SETTERS
    private final void setName (String name){
        this.name = name;
    }

    private final void setAge (int age){
        this.age = age;
    }

    private final void setSex (String sex){
        this.sex = sex;
    }

    //GETTERS
    public String getName (){
        return this.name;
    }

    public int getAge (){
        return this.age;
    }

    public String getSex (){
        return this.sex;
    }

    //METHOD
    public void Birthday(){

    }

    public String Show(){
        return ("Pessoa{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}');
    }

}
