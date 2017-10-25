/**
 * 
 */
package com.wrkspot.mqtt;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wrkspot.mqtt.Sender.Gateway;

/**
 * @author abhinab
 *
 */
@RestController
public class Web {

	@Autowired
	private Gateway gateway;

	@GetMapping("/")
	public @ResponseBody String send() {
		String uuid = UUID.randomUUID().toString();
		try {
			gateway.sendToMqtt(uuid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return uuid;
	}

}
