package entities;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    User userWithEmptyConstructor = new User();
    User getUserWithNotEmptyConstructor = new User("TestUser", "TestPassword", "TestGroup");
    User userSettersTest = new User();
    @Test
    public void testEmptyConstructor() throws Exception{

        String nullName = null;
        String nullGroup = null;
        String nullPassword = null;
        Assert.assertThat(userWithEmptyConstructor.getName(), CoreMatchers.is(nullName));
        Assert.assertThat(userWithEmptyConstructor.getGroup(), CoreMatchers.is(nullGroup));
        Assert.assertThat(userWithEmptyConstructor.getPassword(), CoreMatchers.is(nullPassword));
    }
    @Test
    public void testNotEmptyConstructor() throws Exception{

        String Name = "TestUser";
        String Group = "TestGroup";
        String Password = "TestPassword";
        Assert.assertThat(getUserWithNotEmptyConstructor.getName(), CoreMatchers.is(Name));
        Assert.assertThat(getUserWithNotEmptyConstructor.getGroup(), CoreMatchers.is(Group));
        Assert.assertThat(getUserWithNotEmptyConstructor.getPassword(), CoreMatchers.is(Password));
    }

    @Test
    public void testSetters() throws Exception{
        userSettersTest.setName("SetterName");
        userSettersTest.setPassword("SetterPassword");
        userSettersTest.setGroup("SetterGroup");
        Assert.assertThat(userSettersTest.getName(), CoreMatchers.is("SetterName"));
        Assert.assertThat(userSettersTest.getGroup(), CoreMatchers.is("SetterGroup"));
        Assert.assertThat(userSettersTest.getPassword(), CoreMatchers.is("SetterPassword"));
    }

}
