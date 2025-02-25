import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 * abstract = not fully defined -> defined later in a child class
 * build an abstract class FieldPlanter that will allow for the layRow method to
 * have many forms
 */
public abstract class FieldPlanter extends RobotSE {

    /**
     * Constructs robot
     * 
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @param arg4
     */
    public FieldPlanter(City arg0, int arg1, int arg2, Direction arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);

    }

    // begin by designing main task method - incorporate all similarities
    /**
     * lays a row with any number of things based on child's definition of plant
     * 
     * @param l - length of row
     */
    public void layRow(int l) {

        // lay a row of size l
        for (int i = 0; i < l; i++) {
            move(); // common task
            plant(); // difference task
        }

    }

    public abstract void plant(); // all difference tasks must be abstract (not yet defined)

}
