import ShoopingDatabase.DBConnection;
import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBConnection {
     private DBConnection dbConnection = new DBConnection();

    @Test
    public void testItemAndQtyByName() {
        ResultSet resultSet = null;
        dbConnection.itemAndQytByName("rice");
        Assert.assertEquals(resultSet,"rice");
        try {
            while (resultSet.next()) {
                Assert.assertEquals(resultSet.getString("item_name"),"rice");
                Assert.assertEquals(resultSet.getString("item_price"),"3.99");
            }
        } catch (SQLException sqlException) {
            System.out.println("test fail");
            sqlException.printStackTrace();
        }
    }
}
