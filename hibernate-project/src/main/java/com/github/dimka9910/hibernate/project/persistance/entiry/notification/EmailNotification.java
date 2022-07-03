package com.github.dimka9910.hibernate.project.persistance.entiry.notification;

import javax.persistence.Entity;

@Entity
public class EmailNotification extends Notification{

    private String emailAddress;

}
