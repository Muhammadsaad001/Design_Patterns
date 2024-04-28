/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servicelocator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Muhammad Saad
 */
class ServiceLocator {
    private static Map<Class<?>, MessagingInterface> services = new HashMap<>();

    // Register services
    static {
        services.put(MessagingInterface.class, new EmailService());
        // Register other services if needed
    }

    // Look up a service by its interface
    public static <T> T getService(Class<T> serviceInterface) {
        return serviceInterface.cast(services.get(serviceInterface));
    }
}

// St
