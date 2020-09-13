package com.example.webscoket.demo;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP {

	public static String getHostAddress() {
		String ip = "";
		try {
			InetAddress ip4 = Inet4Address.getLocalHost();
			ip = ip4.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return ip;
	}

}
