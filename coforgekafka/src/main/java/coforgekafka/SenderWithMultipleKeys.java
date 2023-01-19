package coforgekafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class SenderWithMultipleKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		KafkaProducer<String, String> producer = new KafkaProducer(properties);
		String topic = "coforgekafka-topic2";
		for (int i = 101; i < 110; i++) {
			ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, "key1", "Message-->"+i);

			producer.send(record);

		}
		for (int i = 201; i < 210; i++) {
			ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, "key2", "Message-->"+i);

			producer.send(record);

		}
		for (int i = 301; i < 310; i++) {
			ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, "key3", "Message-->"+i);

			producer.send(record);

		}
		for (int i = 401; i < 410; i++) {
			ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, "key4", "Message-->"+i);

			producer.send(record);

		}
		for (int i = 501; i < 510; i++) {
			ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, "key5", "Message-->"+i);

			producer.send(record);

		}
		
		
		System.out.println("Messages Sent");
		producer.close();

	}

}
