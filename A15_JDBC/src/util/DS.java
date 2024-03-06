package util;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class DS {

	private static DataSource ds;
	
	private DS() { //haciendo  privado al constructor hacemos que no se pueda heredar ni se puede crear objeto de la clase
		
	}
	public static DataSource getInstance() {
		if(ds==null) {
			BasicDataSource bds=new BasicDataSource();//clase de apache que tiene datasource
			bds.setDriverClassName("com.mysql.cj.jdbc.driver");
			bds.setUrl("jdbc:mysql://localhost/04_tienda");
			bds.setUsername("root");
			bds.setPassword("Root");
			ds=bds;
		}
		
		return ds;
		
	}
}
