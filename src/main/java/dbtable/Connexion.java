package dbtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {
    PreparedStatement s;
    public Connection getConnection() throws Exception
    {
         Class.forName("org.postgresql.Driver");
         Connection con=DriverManager.getConnection("jdbc:postgresql://postgresql-dranadison.alwaysdata.net:5432/dranadison_enchere","dranadison","alwaysdata12");
         //Connection con=DriverManager.getConnection("jdbc:postgresql:https//postgresql-harisonsanjai.alwaysdata.net:5432/harisonsanjai_mobile","harisonsanjai","lavieperso");
         //Connection con=DriverManager.getConnection("jdbc:postgres://seikxbia:lHeYVAoGcqQawudl6ul1-Ei0U8zxXX04@motty.db.elephantsql.com/seikxbia");
         //Connection con=DriverManager.getConnection("jdbc:postgresql:https//motty.db.elephantsql.com:5432/seikxbia","seikxbia","cFMhonOSE1leCwLEaRmmxpnn516GTxpW");
         //Connection con=DriverManager.getConnection("jdbc:postgresql:https//seikxbia:cFMhonOSE1leCwLEaRmmxpnn516GTxpW@motty.db.elephantsql.com/seikxbia");
         return con;
    }
}
