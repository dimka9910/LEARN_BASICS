package com.github.dimka9910.hibernate.project.persistance.entiry.notification;

import javax.persistence.Entity;

@Entity
public class SmsNotification extends Notification{

    String number;

}
