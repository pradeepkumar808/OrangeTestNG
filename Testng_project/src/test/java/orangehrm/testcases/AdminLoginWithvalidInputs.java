package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.Apputils;
import orangehrm.libraray.Loginpage;


public class AdminLoginWithvalidInputs extends Apputils {
	
	
	@Parameters({"adminuid","adminpwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
		Loginpage lp= new Loginpage();
		lp.login(uid, pwd);
		
		boolean res = lp.isAdminModuleDisplayed();
		Assert.assertTrue(res);
		lp.logout();
	
	}

}
