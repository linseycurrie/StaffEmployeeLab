import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    
    private Director director;
    
    @Before
    public void before(){
        director = new Director("Bob", "120495758l", 50000, "M&S", 60000);
    }
    
    @Test
    public void canGetBudget(){
        assertEquals(60000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, director.payBonus(), 0.01);
    }
}
