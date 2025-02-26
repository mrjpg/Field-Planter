import becker.robots.City;
import becker.robots.Direction;

public class Lay3 extends FieldPlanter{

    public Lay3(City arg0, int arg1, int arg2, Direction arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void plant() {
        // TODO Auto-generated method stub
        putThing();putThing();putThing();
    }

    @Override
    public void happyDance() {
        // TODO Auto-generated method stub
       for (int i = 0;i<100;i++){
            turnRight();
            turnLeft();
       }
    }

}
