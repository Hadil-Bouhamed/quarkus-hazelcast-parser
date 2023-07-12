package org.parse.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientNetworkConfig;

import com.hazelcast.core.HazelcastInstance;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped ///bech tkoun unique 
public class Cluster {

    
    public void createClient(){

         ClientConfig config = new ClientConfig();
         config.setClusterName("dev");
         config.setInstanceName("Second Client");
         config.getConnectionStrategyConfig().getConnectionRetryConfig().setMaxBackoffMillis(5000);
        
        
         ClientNetworkConfig networkConfig = config.getNetworkConfig();
         networkConfig.addAddress("172.19.0.5:5701").setSmartRouting(true)
         .addOutboundPortDefinition("34700-34710").setRedoOperation(true).setConnectionTimeout(5000);


       HazelcastClient.newHazelcastClient(config);
    }



    public HazelcastInstance connection(){
        return HazelcastClient.getHazelcastClientByName("Second Client");
    } 
    
}
