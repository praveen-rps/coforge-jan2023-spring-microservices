package coforgekafka;

import java.io.IOException;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeDeserializer implements Deserializer<Employee>{

	private ObjectMapper mapper= new ObjectMapper();

	@Override
	public Employee deserialize(String topic, byte[] array) {
		// TODO Auto-generated method stub
		Employee employee = null;
		
		try {
			employee= mapper.readValue(array,Employee.class);
		}
		catch(DatabindException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	
}
