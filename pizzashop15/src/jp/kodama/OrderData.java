package jp.kodama;
 
import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class OrderData {
    @PrimaryKey
    //@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    //private Long id;
     
    @Persistent
    private String name;
     
    @Persistent
    private String adress;
     
    @Persistent
    private String number;
     
    @Persistent
    private Date datetime;
    
    @Persistent
    private String order;
 
    public OrderData(String name, String adress, String number, Date datetime,String order) {
        super();
        this.name = name;
        this.adress = adress;
        this.number = number;
        this.datetime = datetime;
        this.order = order;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAdress() {
        return adress;
    }
 
    public void setAdress(String adress) {
        this.adress = adress;
    }
 
    public String getNumber() {
        return number;
    }
 
    public void setNumber(String number) {
        this.number = number;
    }
 
    public String getOrder() {
        return order;
    }
 
    public void setOrder(String order) {
        this.order = order;
    }
 
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}