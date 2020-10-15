package com.openlibrary.openlibrary.myprofile.entity;

import java.util.List;

import javax.persistence.*;

import com.openlibrary.openlibrary.availablebooks.entity.AvailableBooksEntity;
import com.openlibrary.openlibrary.mybooks.entity.*;
import com.openlibrary.openlibrary.notification.entity.NotificationEntity;

@Entity
@Table
public class MyProfileEntity {

    @Id
    @GeneratedValue
    private long id;
     
    private String firstName;
    private String lastName;
    private String emailId;
    private String address;
     
    
  
    
    @OneToMany(mappedBy ="myProfileEntity", cascade = CascadeType.ALL)
    private List<MyBooksEntity> myBooksList;
    @OneToMany(mappedBy ="myProfileEntity", cascade = CascadeType.ALL)
    private List<AvailableBooksEntity> availableBooksList;
   
    
    @OneToMany(mappedBy ="myProfileEntity", cascade = CascadeType.ALL)
    private List<NotificationEntity> notificationList;
    
    @OneToMany(mappedBy ="senderProfileEntity", cascade = CascadeType.ALL)
    private List<NotificationEntity> senderNotificationList;
    
    
    public List<NotificationEntity> getNotificationList() {
        return notificationList;
    }
    public void setNotificationList(List<NotificationEntity> notificationList) {
        this.notificationList = notificationList;
    }
    public long getId() {
        return id;
    }
    public List<MyBooksEntity> getMyBooksList() {
        return myBooksList;
    }
    public List<AvailableBooksEntity> getAvailableBooksList() {
        return availableBooksList;
    }
    public void setAvailableBooksList(List<AvailableBooksEntity> availableBooksList) {
        this.availableBooksList = availableBooksList;
    }
    public void setMyBooksList(List<MyBooksEntity> myBooksList) {
        this.myBooksList = myBooksList;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<NotificationEntity> getSenderNotificationList() {
        return senderNotificationList;
    }
    public void setSenderNotificationList(List<NotificationEntity> senderNotificationList) {
        this.senderNotificationList = senderNotificationList;
    }
    
}
