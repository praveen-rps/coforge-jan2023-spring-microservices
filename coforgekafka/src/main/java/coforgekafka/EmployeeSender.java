package coforgekafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class EmployeeSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, EmployeeSerializer.class.getName());

		KafkaProducer<String, Employee> producer = new KafkaProducer(properties);
		String topic = "employeetopic";
		for (int i = 1; i < 10; i++) {
			ProducerRecord<String, Employee> record = new ProducerRecord<String, Employee>(topic, "employee->"+i, new Employee(i,"name->"+i, "designation->"+i));
			producer.send(record);
		}
		
		System.out.println("Messages Sent");
		producer.close();

	}

}
