package springexamples;

import org.springframework.stereotype.Component;

@Component("mysql")
class MySQLConnection implements Dao{
		public String getConnection(){
			return "mysql connection";
		}
}