import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
    
    private DatabaseAdmin databaseAdmin;
    
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", "124556K", 30000);
    }


    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(35000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.01);
    }

}
