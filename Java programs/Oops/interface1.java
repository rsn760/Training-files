package Oops;

interface world {
    void state();
}
interface country {
    void village();
}
class universe implements world,country{
    public void state(){
        System.out.println("My Country is India");
    }
    public void village() {
        System.out.println("I am From Andhra");
    }
    }

public class interface1 {
	
	    public static void main(String[] args) {
	        universe u=new universe();
	        u.state();
	        u.village();
	    }
	}


