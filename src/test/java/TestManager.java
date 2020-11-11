import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "12345J", 20000,"Sales");
    }

    @Test
    public void hasDept(){
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(25000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, manager.payBonus(), 0.01);
    }

    @Test
    public void negativeInputDoesNotChangeSalary(){
        manager.raiseSalary(-5000);
        assertEquals(20000, manager.getSalary(),0.01);
    }

    @Test
    public void canNotSetNameToNull(){
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }



}
