public class constructors {
    public static void main(String[] args) {
        // test a=new test();

        System.out.println(test.test);
        
    } 
    
}

//we can not create an object with empty constructor if there is atleast one parameterized constructor 
class test{
    int a;
    static String test="hello this is a variable without object";
    test(int num){
        a=num;
    }
    test(){

    }
}