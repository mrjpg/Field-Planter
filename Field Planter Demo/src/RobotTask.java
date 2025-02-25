/**
 * Here is a task for a team of robots. Suppose we want to lay down things in a field that
has five rows and four columns. Suppose that we want the odd numbered rows (first,
third, and fifth) to have two things on each corner and we want the other rows to have
three things on each corner.

 * @author YOU
 */
import becker.robots.*;

public class RobotTask {


	/**
	 * runs robot task to complete the planting
	 */
	public void run() {

		// build a random city called waterloo
		City field = new City(10, 10);
		field.showThingCounts(true);
		
		// build a robot in the city waterloo starting 
		//FieldPlanter rob = new FieldPlanterOdd(field, 1, 0, Direction.EAST, 100);
		


	}
}