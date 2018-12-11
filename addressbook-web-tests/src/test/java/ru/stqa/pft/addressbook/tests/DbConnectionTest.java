package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.RegistrationData;

import java.sql.*;

public class DbConnectionTest {

    @Test
    public void dbConnectionTest() {
        Connection conn = null;
        RegistrationData data = new RegistrationData();

        try(PreparedStatement pstmt = conn.prepareStatement("SELECT LastName, FirstName FROM Person.Contact WHERE LastName = ?");) {
            pstmt.setString(1, "Smith");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("LastName") + ", " + rs.getString("FirstName"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            //conn = DriverManager.getConnection("jdbc:sqlserver://192.168.88.151,63173?user=fuse8datareader&password=fuse8datareader&serverTimezone=UTC");
            conn = DriverManager.getConnection("jdbc:sqlserver://192.168.88.151,63173?user=fuse8datareader&password=fuse8datareader&serverTimezone=UTC");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT dbo.Users.MobilePhone, dbo.UserProfiles.Birthday\n" +
                    "FROM     dbo.UserTariffHistory INNER JOIN\n" +
                    "                  dbo.Users ON dbo.UserTariffHistory.UserId = dbo.Users.Id INNER JOIN\n" +
                    "                  dbo.UserProfiles ON dbo.Users.Id = dbo.UserProfiles.UserId\n" +
                    "WHERE  dbo.UserTariffHistory.TariffId = 1");
            while (rs.next()) {
                new RegistrationData()
                        .withMobile(rs.getString("dbo.Users.MobilePhone"))
                        .withBirthDay(rs.getString("dbo.UserProfiles.Birthday"));
            }
            rs.close();
            st.close();
            conn.close();
            System.out.println(data);
        } catch (
                SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
