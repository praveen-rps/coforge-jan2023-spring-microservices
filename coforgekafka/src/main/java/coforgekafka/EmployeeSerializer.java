package coforgekafka;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeSerializer implements Serializer<Employee> {
	
	private ObjectMapper mapper= new ObjectMapper();

	@Override
	public byte[] serialize(String topic, Employee data) {
		// TODO Auto-generated method stub
		byte[] array = null;
		
		try {
			array= mapper.writeValueAsBytes(data);
		}
		catch(JsonProcessingException e) {
			e.printStackTrace();
		}
		return array;
	}

}
