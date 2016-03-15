package com.jpmc.anil.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.jpmc.anil.mybatis.service.Employee;

public class TestClient {
    public static void main(String[] args) {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.addAddress("127.0.0.1:5701");
        HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
        IMap map = client.getMap("test");
        System.out.println("Map Size:" + map.size());
        System.out.println(map.entrySet());
        IMap<Long, Employee> empMap = client.getMap("emps");
        System.out.println(empMap.entrySet());
        System.exit(0);

    }
}
