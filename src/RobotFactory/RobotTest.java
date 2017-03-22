package RobotFactory;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RobotTest {

	private ManageRobot robot;

	@Before
	public void setup() {
		robot = new ManageRobot();
	}

	@Test
	public void shouldGenerateName() throws Exception {
		robot.giveName();

		assertFalse(robot.getName().isEmpty());
	}

	@Test
	public void shouldGiveExpectedLength() throws Exception {
		robot.giveName();

		String str = robot.getName();

		int nameLenght = str.length();

		assertEquals(5, nameLenght);
	}

	// check the right pattern of the name
	@Test
	public void shouldGiveExpectedName() throws Exception {
		robot.giveName();
		String name = robot.getName();
		char[] nameArray = name.toCharArray();

		int i = 0;
		int count = 0;

		while (i != 2) {// to check the first two alphabets are uppercase
			Character charAlpha = nameArray[i];

			Assert.assertTrue(Character.isUpperCase(charAlpha));

			count += 1;
			i++;
		}

		while (i != 5) {// to check the next three are digits
			Character charDigit = nameArray[i];

			Assert.assertTrue(Character.isDigit(charDigit));
			count += 1;
			i++;
		}

		/*if (count == 5) {
			System.out.println("You got the Expected name " + name);
		}*/
	}

	@Test
	public void shouldWipeNameWhenReset() throws Exception {
		robot.resetRobot();

		Assert.assertTrue(robot.getName().isEmpty());
		//System.out.println("As it is reset it doesn't have the name");

	}

	@Test
	public void shouldGiveNewName() throws Exception {
		robot.giveName();
		String oldName = robot.getName();
		
		robot.resetRobot();
		robot.askName();
		
		String newName = robot.getName();

		Assert.assertFalse(oldName.equals(newName));

		//System.out.println("You got the new name " + newName);
	}
}
