package com.wrkspot.mqtt.reader;

import java.sql.Timestamp;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Reader //implements MqttCallback 
{

//	static MqttClient mqttClient;
//
//	static {
//		try {
//			mqttClient = new MqttClient("tcp://127.0.0.1:1883", "WrkSpot-Reader");
//			MqttConnectOptions connOpts = new MqttConnectOptions();
//			connOpts.setCleanSession(true);
//			mqttClient.connect(connOpts);
//		} catch (MqttException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void main(String[] args) throws InterruptedException {
//		mqttClient.setCallback(new MqttCallback() {
//
//			public void messageArrived(String topic, MqttMessage message) throws Exception {
//				String time = new Timestamp(System.currentTimeMillis()).toString();
//				System.out.println(
//						"\nReceived a Message!" + "\n\tTime:    " + time + "\n\tTopic:   " + topic + "\n\tMessage: "
//								+ new String(message.getPayload()) + "\n\tQoS:     " + message.getQos() + "\n");
//			}
//
//			public void connectionLost(Throwable cause) {
//				System.out.println("Connection to Solace broker lost!" + cause.getMessage());
//			}
//
//			public void deliveryComplete(IMqttDeliveryToken token) {
//				System.out.println("deluivery complete");
//			}
//
//		});
//	}

//	@Override
//	public void connectionLost(Throwable paramThrowable) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void messageArrived(String paramString, MqttMessage paramMqttMessage) throws Exception {
//		System.out.println("*************");
//		System.out.println(paramMqttMessage);
//	}
//
//	@Override
//	public void deliveryComplete(IMqttDeliveryToken paramIMqttDeliveryToken) {
//		try {
//			System.out.println(paramIMqttDeliveryToken.getMessage());
//		} catch (MqttException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
