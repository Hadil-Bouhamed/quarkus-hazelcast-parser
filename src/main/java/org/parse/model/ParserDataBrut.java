package org.parse.model;

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
        public void setID(Integer iD) {
            ID = iD;
        }
        public void setType(Integer type) {
            this.type = type;
        }
        public void setBattery(Integer battery) {
            Battery = battery;
        }
        public void setTemperature(double temperature) {
            Temperature = temperature;
        }
        public void setHumidity(Integer humidity) {
            Humidity = humidity;
        }
        public void setLuminosity(Integer luminosity) {
            Luminosity = luminosity;
        }
        public void setCounter(Integer counter) {
            this.counter = counter;
        }
        public void setTMicro(double tMicro) {
            TMicro = tMicro;
        }
    
       

        
}
