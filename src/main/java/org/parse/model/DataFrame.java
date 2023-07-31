package org.parse.model;
import java.time.LocalDateTime;

public class DataFrame  {
    Integer Gateway;
    Integer App;  
    String TypeGw ;
    LocalDateTime Date ;
    LocalDateTime Date_srv;
    String Data ;
    Integer Resp ;
    String FID ;
    Integer Snr ;
    Integer Rssi ;

    
    public DataFrame() {
    }


    public DataFrame(Integer gateway, Integer app, String typeGw, LocalDateTime date, LocalDateTime date_srv, String data,
            Integer resp, String fID, Integer snr, Integer rssi) {
        Gateway = gateway;
        App = app;
        TypeGw = typeGw;
        Date = date;
        Date_srv = date_srv;
        Data = data;
        this.Resp = resp;
        FID = fID;
        Snr = snr;
        Rssi = rssi;
    }


    public Integer getGateway() {
        return Gateway;
    }


    public void setGateway(Integer gateway) {
        Gateway = gateway;
    }


    public Integer getApp() {
        return App;
    }


    public void setApp(Integer app) {
        App = app;
    }


    public String getTypeGw() {
        return TypeGw;
    }


    public void setTypeGw(String typeGw) {
        TypeGw = typeGw;
    }


    public LocalDateTime getDate() {
        return Date;
    }


    public void setDate(LocalDateTime date_srv2) {
        Date = date_srv2 ; 
    }


    public LocalDateTime getDate_srv() {
        return Date_srv;
    }


    public void setDate_srv(LocalDateTime date_srv) {
        Date_srv = date_srv;
    }


    public String getData() {
        return Data;
    }


    public void setData(String data) {
        Data = data;
    }


    public Integer getResp() {
        return Resp;
    }


    public void setResp(Integer resp) {
        this.Resp = resp;
    }


    public String getFID() {
        return FID;
    }


    public void setFID(String Fid) {
        FID = Fid;
    }


    public Integer getSnr() {
        return Snr;
    }


    public void setSnr(Integer snr) {
        Snr = snr;
    }


    public Integer getRssi() {
        return Rssi;
    }


    public void setRssi(Integer rssi) {
        Rssi = rssi;
    }


  

    

}
