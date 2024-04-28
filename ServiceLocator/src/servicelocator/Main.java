/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicelocator;

/**
 *
 * @author Muhammad Saad
 */
public class Main {
    public static void main(String[] args) {
        // Request the messaging service through the service locator
        MessagingInterface messagingService = ServiceLocator.getService(MessagingInterface.class);
        
        // Use the messaging service
        messagingService.sendMessage("Hello from Service Locator!");
    }
}
