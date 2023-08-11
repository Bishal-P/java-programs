class inheritance {

public static void main(String[] args) {
    second aa=new second("Bishal","btech");
    aa.display();
}
    
}

class first{
    
    String name,clas;
    first(){
        System.out.println("First");
    }
    
}

class second extends first{
    second(String n,String c){
        name=n;
        clas=c;
    }
    
    void display(){
        System.out.println("The name ="+name+" class="+clas);
    }
}