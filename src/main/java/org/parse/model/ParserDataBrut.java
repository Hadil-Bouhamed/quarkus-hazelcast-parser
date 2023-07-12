package org.parse.model;
import com.hazelcast.topic.Message;
import jakarta.transaction.Transactional;

public class ParserDataBrut {
        Integer ID ; 
        Integer type ;
        Integer Battery ;
        double Temperature ;
        Integer Humidity ;
        Integer Luminosity ;
        Integer counter ;
        double TMicro ;



        public ParserDataBrut(Integer iD, Integer type, Integer battery, double temperature, Integer humidity,
                Integer luminosity, Integer counter, double tMicro) {
            ID = iD;
            this.type = type;
            Battery = battery;
            Temperature = temperature;
            Humidity = humidity;
            Luminosity = luminosity;
            this.counter = counter;
            TMicro = tMicro;
        }
        public ParserDataBrut() {
        }


       public Integer getID() {
            return ID;
        }
        public Integer getType() {
            return type;
        }
        public Integer getBattery() {
            return Battery;
        }
        public double getTemperature() {
            return Temperature;
        }
        public Integer getHumidity() {
            return Humidity;
        }
        public Integer getLuminosity() {
            return Luminosity;
        }
        public Integer getCounter() {
            return counter;
        }
        public double getTMicro() {
            return TMicro;
        }
    
        public void  setID(String data) {
            String nodeID = data.substring(6, 8) + data.substring(4, 6) + data.substring(2, 4) + data.substring(0, 2);
            this.ID  = Integer.parseInt(nodeID, 16);
           
        }

        public void  setType(String data) {
         this.type = Integer.parseInt(data.substring(8, 10), 16);
            
        }
        public void  setBattery(String data) {
            this.Battery = Integer.parseInt(data.substring(10, 12), 16);
          
        }
        public void setTemperature(String data) {
            this.Temperature = ((short) Integer.parseInt(data.substring(14, 16) + data.substring(12, 14), 16)) / 100.d;
            
        }
        public void  setHumidity(String data) {
           this.Humidity = Integer.parseInt(data.substring(18, 20) + data.substring(16, 18), 16);
           
        }
        public void setLuminosity(String data) {
           this.Luminosity = Integer.parseInt(data.substring(22, 24) + data.substring(20, 22), 16);
          
        }
        public void  setCounter(String data) {
            this.counter = Integer.parseInt(data.substring(24, 26), 16);
            
        }
        public void setTMicro(String data) {
            this.TMicro = ((short) Integer.parseInt(data.substring(28, 30) + data.substring(26, 28), 16)) / 100.d;
            
        }


    


        @Transactional
        public void OnMessage(Message<DataFrame> message)
        {

            String publisher = message.getPublishingMember().toString();
            System.out.println("Published by: " + publisher);
            ParserDataBrut databrut = new ParserDataBrut();
            DataFrame dataframe = message.getMessageObject();
            System.out.println("Received message: " + dataframe);
            String Data = dataframe.getData();
            databrut.setID(Data);
            databrut.setType(Data);
            databrut.setBattery(Data);
            databrut.setTemperature(Data);
            databrut.setHumidity(Data);
            databrut.setLuminosity(Data);
            databrut.setCounter(Data);
            databrut.setTMicro(Data);
           System.out.println("temperature = " + databrut.getTemperature());
           System.out.println("luminosité = " + databrut.getLuminosity() );
            
        }

        
}
