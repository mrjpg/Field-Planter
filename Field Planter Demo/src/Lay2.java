import becker.robots.City;
import becker.robots.Direction;

public class Lay2 extends FieldPlanter {

    public Lay2(City arg0, int arg1, int arg2, Direction arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        
    }

    @Override
    public void plant() {
       putThing();putThing();
    }

    @Override
    public void happyDance() {
        // TODO Auto-generated method stub
        System.out.println("I don't DANCE!");
    }

}
