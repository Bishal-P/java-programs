public class staticChecking {
    public static void main(String[] args) {
        // Student a=new Student("Bishal",1);
        System.out.println("Static value ="+Student.college);
        Student.college="BPPIMT";
        System.out.println("Static value ="+Student.college);
        // Student b=new Student("Bishal2", 2);
        System.out.println("Static value ="+Student.college);
        Student.changeCollegeName("aec");
        System.out.println("Static value ="+Student.college);

    }
}

class Student{
    String x;
    int y;
    static String college="Abc";
    Student(String name,int roll){
        x=name;
        y=roll;
    }
    static void changeCollegeName(String newName){
        college=newName;
    }

}