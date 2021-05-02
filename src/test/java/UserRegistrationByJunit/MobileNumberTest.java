package UserRegistrationByJunit;
import org.junit.Assert;
import org.junit.Test;
public class MobileNumberTest {
	@Test
	public void givenMobileeReturnTrueIfValid(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validatePhoneNumber("91 9870652165");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenMobileeReturnFalseIfMobileNumberContainsMoreThan10Digits(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validatePhoneNumber("91 987065216525");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenMobileeReturnFalseIfMobileNumberContainsLessThan10Digits(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validatePhoneNumber("91 987065");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenMobileeReturnFalseIfSpaceIsNotGivenBetweenMobileNumberAndCountryCode(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validatePhoneNumber("919870652165");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenMobileeReturnFalseIfCountryCodeIsMoreThan2Digits(){
		UserRegistration test = new UserRegistration();
		boolean result = test.validatePhoneNumber("910 9870652165");
		Assert.assertEquals(false, result);
	}
}
