package com.wrkspot.mqtt.sender;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import com.wrkspot.mqtt.reader.Reader;

public class Sender {

//	static MqttClient mqttClient;
//
//	static {
//		try {
//			mqttClient = new MqttClient("tcp://127.0.0.1:1883", "WrkSpot-Sender");
//			MqttConnectOptions connOpts = new MqttConnectOptions();
//			connOpts.setCleanSession(true);
//			mqttClient.setCallback( new Reader() );
//			mqttClient.connect(connOpts);
//		} catch (MqttException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void main(String[] args) {
//		MqttMessage message = new MqttMessage("Hello world from MQTT!".getBytes());
//		message.setQos(0);
//		try {
//			mqttClient.publish("WrkSpot-topic", message);
//			mqttClient.disconnect();
//		} catch (MqttException e) {
//			e.printStackTrace();
//		}
//	}

}
