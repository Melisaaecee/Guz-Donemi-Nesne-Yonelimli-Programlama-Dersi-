package ders1;

public class Data {
    public String name;
    public String surname;
    public int studentnumber;
    public int age;
    public  String dersgrubu;
    

    public Data(String name, String surname, int studentnumber, int age,String dersgrubu) {
        this.name = name;
        this.surname = surname;
        this.studentnumber = studentnumber;
        this.age = age;
        this.dersgrubu = dersgrubu;
    }

    void print() {
        System.out.println("name: " + name + " surname: " + surname + " Studentnumber: " + studentnumber + " age: " + age + " sınıf bilgisi: "+ dersgrubu);

    }
}
