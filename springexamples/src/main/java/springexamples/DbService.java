package springexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



@Component

public class DbService {
	
	@Autowired
	@Qualifier("mysql")
	Dao dao;
		
	public DbService() {
		
	}
	
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
	public String getDataConnection() {
		return dao.getConnection();
	}

}
