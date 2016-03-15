package com.jpmc.anil.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class TestApp {

    public static void main(String[] args) {
        // Config cfg = new ClasspathXmlConfig("hazelcast.xml");
        // cfg.setInstanceName("instance1");
        HazelcastInstance instance = Hazelcast.newHazelcastInstance();

        // Map<Long, String> map = instance.getMap("test");
        // IdGenerator gen = instance.getIdGenerator("gen");
        // for (int i = 0; i < 10; i++) {
        // map.put(gen.newId(), "stuff " + i);
        // }
        System.out.println(instance);
        IMap<Long, String> empMap = instance.getMap("emps");
        System.out.println(empMap.entrySet());
        // System.out.println(map.size());
        // Map<Long, String> map2 = instance2.getMap("test");
        // for (Map.Entry entry : map2.entrySet()) {
        // System.out.printf("entry: %d; %s\n", entry.getKey(), entry.getValue());
        // }

        System.out.println();
        System.out.println();
        // System.exit(0);

    }
}
