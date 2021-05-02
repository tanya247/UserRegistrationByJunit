package UserRegistrationByJunit;

import org.junit.Test;

import org.junit.Assert;
public class FirstNameTest {
	@Test
	public void givenFirstNameReturnTrueWhenFirstLetterIsCapital(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validateFirstName("Tanya");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenFirstNameReturnFalseWhenFirstLetterIsSmall(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validateFirstName("tanya");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenFirstNameReturnTrueWhenLettersIsLessThan3(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validateFirstName("Ta");
		Assert.assertEquals(false, result);
	}
}