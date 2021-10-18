package pl.supra.secret;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.Statement;

public class DataSourceProvider {
    private static DataSource dataSource;

    public DataSourceProvider() {}

    static DataSource getDataSource() throws NamingException {
        if (dataSource == null){
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env/");
            dataSource = (DataSource) envContext.lookup("jdbc/secret");
        }
        return dataSource;
    }
}
