public class constructors {
    public static void main(String[] args) {
        test a=new test();
        
    }


    
    
}

//we can not create an object with empty constructor if there is atleast one parameterized constructor 
class test{
    int a;
    test(int num){
        a=num;
    }
    test(){

    }
}