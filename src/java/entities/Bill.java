package entities;
// Generated Nov 22, 2017 11:02:05 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Bill generated by hbm2java
 */
public class Bill  implements java.io.Serializable {


     private Integer id;
     private int userId;
     private double total;
     private String payment;
     private String address;
     private Date date;

    public Bill() {
    }

    public Bill(int userId, double total, String payment, String address, Date date) {
       this.userId = userId;
       this.total = total;
       this.payment = payment;
       this.address = address;
       this.date = date;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    public String getPayment() {
        return this.payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


