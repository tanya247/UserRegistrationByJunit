package UserRegistrationByJunit;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PasswordTest
{
	private String validPassword;
	private boolean expectedOutput;
	public PasswordTest(String Password, boolean Result)
	{
		
		this.validPassword = Password;
		this.expectedOutput = Result;
	}
	@Parameterized.Parameters
	public static Collection input()
	{
		return Arrays.asList(new Object [][] { {"Tanya@245",  true},
											{"Tanya245@",true},
											{"tanya@245",false},
											{"tanya",false},
											{"tanya245",false},
											{"@tanya245",false},
											{"24515455",false},
											{"245@Tanya",true},
											{"taNya@245",true}
		});
	}
	@Test
	public void givenPasswordShouldGiveCorrectResult()
	{
		UserRegistration ur = new UserRegistration();
		boolean result = ur.validatePassword(validPassword);
		Assert.assertEquals(expectedOutput, result);
	}

}
