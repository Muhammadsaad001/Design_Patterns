/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicelocator;

/**
 *
 * @author Muhammad Saad
 */
class EmailService implements MessagingInterface {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}