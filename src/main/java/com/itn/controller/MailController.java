/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controller;

/**
 *
 * @author elwyn
 */
public class MailController {

    /*
    M A I L S E R V E R --- P R O P E R T I E S
    
    1. MailSender interface: The top-level interface that provides basic functionality for sending simple emails
    2. JavaMailSender interface: the subinterface of the above MailSender. It supports MIME messages and is mostly used in conjunction with the MimeMessageHelper class for the creation of a MimeMessage. It’s recommended to use the MimeMessagePreparator mechanism with this interface
    3. JavaMailSenderImpl class: provides an implementation of the JavaMailSender interface. It supports the MimeMessage and SimpleMailMessage
    4. SimpleMailMessage class: used to create a simple mail message including the from, to, cc, subject and text fields
    5. MimeMessagePreparator interface: provides a callback interface for the preparation of MIME messages
    6. MimeMessageHelper class: helper class for the creation of MIME messages. It offers support for images, typical mail attachments and text content in an HTML layout
     */
    
    
}
