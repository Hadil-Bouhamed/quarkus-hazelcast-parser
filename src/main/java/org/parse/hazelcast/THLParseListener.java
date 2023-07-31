package org.parse.hazelcast;

import org.parse.model.DataFrame;
import org.parse.model.ParserDataBrut;

import com.hazelcast.topic.Message;
import com.hazelcast.topic.MessageListener;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;


@ApplicationScoped
public class THLParseListener implements  MessageListener<DataFrame> {

    
    
    @Transactional
    public void onMessage(Message<DataFrame> message) {
        ThlParser(message.getMessageObject()); 
        throw new UnsupportedOperationException("Unimplemented method 'onMessage'");
    }

     
    public ParserDataBrut ThlParser(DataFrame dataframe) {
       
        String Data = dataframe.getData();
        Integer Id = getID(Data);
        Integer type = getType(Data);
        Integer battery = getBattery(Data);
        double temp = getTemperature(Data);
        Integer humidity = getHumidity(Data);
        Integer luminosity = getLuminosity(Data);
        Integer counter = getCounter(Data);
        double micro = getTMicro(Data);
        ParserDataBrut databrut = new ParserDataBrut(Id,type,battery,temp,humidity,luminosity,counter,micro);
        System.out.println("Temp = "+databrut.getTemperature());
        System.out.println("Battery = "+databrut.getBattery());
        System.out.println("luminosity = "+databrut.getLuminosity());
        System.out.println("Humidity = "+databrut.getHumidity());
        return databrut;
    }

     public Integer getID(String data) {
         String nodeID = data.substring(6, 8) + data.substring(4, 6) + data.substring(2, 4) + data.substring(0, 2);
         return Integer.parseInt(nodeID, 16);
           
        }

        public Integer getType(String data) {
         return  Integer.parseInt(data.substring(8, 10), 16);
            
        }
        public Integer getBattery(String data) {
            return Integer.parseInt(data.substring(10, 12), 16);
          
        }
        public double getTemperature(String data) {
            return ((short) Integer.parseInt(data.substring(14, 16) + data.substring(12, 14), 16)) / 100.d;
            
        }
        public Integer  getHumidity(String data) {
           return Integer.parseInt(data.substring(18, 20) + data.substring(16, 18), 16);
           
        }
        public Integer getLuminosity(String data) {
           return Integer.parseInt(data.substring(22, 24) + data.substring(20, 22), 16);
          
        }
        public Integer getCounter(String data) {
            return  Integer.parseInt(data.substring(24, 26), 16);
            
        }
        public double getTMicro(String data) {
            return ((short) Integer.parseInt(data.substring(28, 30) + data.substring(26, 28), 16)) / 100.d;
            
        }


    
    }
