package org.talend.spark.operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.spark.api.java.function.Function;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
//import org.apache.spark.streaming.kafka.KafkaUtils;

import org.apache.spark.streaming.kafka.KafkaUtils;

import scala.Tuple2;

public class KafkaLoad<T> {
	public static JavaDStream<List<Object>> kafkaStream(
			JavaStreamingContext ctx, String zookeeper, String ConsumerGroup,
			String kafkaTopics, Integer numThreads) {
		Map<String, Integer> topicMap = new HashMap<String, Integer>();
		topicMap.put(kafkaTopics, numThreads);

		JavaPairReceiverInputDStream<String, String> inputDStream = null;
		inputDStream = KafkaUtils.createStream(ctx, zookeeper, ConsumerGroup,
				topicMap);

		return inputDStream
				.map(new Function<Tuple2<String, String>, List<Object>>() {

					private static final long serialVersionUID = 1L;

					public List<Object> call(Tuple2<String, String> tuple2) {
						List<Object> list = new ArrayList<Object>();
						list.add(tuple2._2());
						return list;
					}
				});
	}
}