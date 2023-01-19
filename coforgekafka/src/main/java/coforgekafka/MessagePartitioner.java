package coforgekafka;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

public class MessagePartitioner implements Partitioner {

	@Override
	public void configure(Map<String, ?> configs) {
		// TODO Auto-generated method stub
		System.out.println("configuring..");
	}

	@Override
	public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {
		// TODO Auto-generated method stub
		int partition=4;
		if(key.equals("key1"))
				partition=3;
		else if(key.equals("key2"))
				partition=2;
		else if(key.equals("key3"))
				partition=1;
		else
			partition=0;
		return partition;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("configuring..");
	}
}
