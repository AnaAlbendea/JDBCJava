package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import util.DS;

public class Test01 {

	public static void main(String[] args)throws SQLException {
		DataSource ds= DS.getInstance(); //paso 1
		Connection con=ds.getConnection(); //paso 2
		Statement st= con.createStatement(); //paso 3
		ResultSet rs=st.executeQuery("select id_producto,producto,precio from productos");
		while (rs.next()) {
			System.out.println(rs.getInt("id_producto")+ "-"+
								rs.getString("producto")+"-"+
								rs.getDouble("precio"));
		}
		
		con.close();
	}

}
