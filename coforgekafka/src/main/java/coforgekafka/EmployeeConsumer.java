package coforgekafka;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class EmployeeConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, EmployeeDeserializer.class.getName());
		properties.put(ConsumerConfig.GROUP_ID_CONFIG,"group1");
		
		KafkaConsumer<String, Employee> consumer = new KafkaConsumer<String, Employee>(properties);
		List<String> topics = Collections.singletonList("employeetopic");

		consumer.subscribe(topics);
		System.out.println("consumer wating for messages");
		while (true) {
			ConsumerRecords<String, Employee> records = consumer.poll(Duration.ofSeconds(1));

			records.forEach(rd -> {
				System.out.println("key:" + rd.key() + " value : " + rd.value().id+" "+rd.value().getName()+" "+rd.value().getDepartment() + " partititon: " + rd.partition());
			});
		}

	}

}
