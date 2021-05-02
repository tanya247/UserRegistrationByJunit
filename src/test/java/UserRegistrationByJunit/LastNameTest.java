package UserRegistrationByJunit;

import org.junit.Assert;
import org.junit.Test;

public class LastNameTest {
	@Test
	public void givenLastNameReturnTrueWhenFirstLetterIsCapital(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validateLastName("Kansal");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenLastNameReturnFalseWhenFirstLetterIsSmall(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validateLastName("kansal");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenFirstNameReturnTrueWhenLettersIsLessThan3(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validateLastName("Ka");
		Assert.assertEquals(false, result);
	}
}
