package UserRegistrationByJunit;
package UserRegistrationByJunit;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
public class EmailTest {
	boolean expectedOutput;
	String validEmail;
	public EmailTest(String Email, boolean Result) {
		this.expectedOutput = Result;
		this.validEmail = Email;
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object [][] { {"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc+100@gmail.com", false},
			{"abc", false},
			{"abc123@gmail.a", false},
			{"abc123@.com", false},
			{".abc@abc.com", true},
			{"abc()*@gmail.com", false},
			{"abc..2002@gmail.com", true},
			{"abc.@gmail.com", true},
			{"abc@abc@gmail.com", false},
			{"abc@gmail.com.1a", false},
				
		});
	}
	@Test
	public void givenEmailShouldGiveCorrectResult()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validateEmailAddress(validEmail);
		Assert.assertEquals(expectedOutput, result);
	}
}	
