package springexamples;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleConnection implements Dao{

	public String getConnection() {
		// TODO Auto-generated method stub
		return "Oracle Connection";
	}

}
