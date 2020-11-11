import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "123456C", 40000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(45000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, developer.payBonus(), 0.01);
    }
}
