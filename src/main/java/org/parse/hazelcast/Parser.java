package org.parse.hazelcast;
import org.parse.model.DataFrame;
import com.hazelcast.topic.ITopic;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class Parser  {
    @Inject 
    Cluster hzcluster ;
    @Inject 
    THLParseListener thldataframe;

    @Transactional
    public void consume() {
       ITopic<DataFrame> topic = hzcluster.connection().getTopic("THL Data Brut");
       topic.addMessageListener(thldataframe);
       System.out.println("Subscribed");
    }
}