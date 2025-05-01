package nobubilt.codesignal.design;

public class FacadeDesignPattern2 {

	/**
	 * You are developing a SmartHomeSystem class to control various devices in a smart home, 
	 * such as lights, thermostats, and security cameras. The system already supports basic 
	 * operations for individual devices (e.g., turning on/off lights, adjusting thermostat 
	 * temperatures, enabling/disabling security cameras) through their respective 
	 * classes: Light, Thermostat, and SecurityCamera. However, as the system grows in complexity,
	 *  homeowners find it challenging to execute common scenarios
	 *   (e.g., "Leaving Home" or "Arriving Home") that require interacting with multiple devices 
	 *   simultaneously.

To simplify these operations and keep the system backward compatible with future device additions 
or changes, implement a SmartHomeFacade class. This facade should provide simplified methods to 
perform complex operations involving multiple devices with a single call, without changing the 
existing device classes or the SmartHomeSystem class interfaces.

The leavingHome() method should turn off all lights, set the thermostat to an eco-friendly 
temperature (say 18°C), enable all security cameras, and print "Leaving home procedure executed".
The arriveHome() method should turn on all lights, set the thermostat to 22 degrees, disable all
 security cameras, and print "Arrive home procedure executed".
Your task will not only simplify control of a smart home for end-users but also ensure that any 
future enhancements or device integrations can be undertaken without affecting the facade's consumers, 
thus maintaining backward compatibility.
	 */
	
	// Light class
    public static class Light {
        public void turnOn() {
            System.out.println("Light turned on");
        }

        public void turnOff() {
            System.out.println("Light turned off");
        }
    }

    // Thermostat class
    public static class Thermostat {
        public void setTemperature(int degrees) {
            System.out.println("Temperature set to " + degrees + " degrees Celsius");
        }
    }

    // SecurityCamera class
    public static class SecurityCamera {
        public void enable() {
            System.out.println("Security camera enabled");
        }

        public void disable() {
            System.out.println("Security camera disabled");
        }
    }

    // SmartHomeFacade class
    public static class SmartHomeFacade {
        private Light[] lights;
        private Thermostat thermostat;
        private SecurityCamera[] cameras;

        public SmartHomeFacade(Light[] lights, Thermostat thermostat, SecurityCamera[] cameras) {
            this.lights = lights;
            this.thermostat = thermostat;
            this.cameras = cameras;
        }

        // TODO: Implement a method `leavingHome()` that turns off all lights,
        // sets the thermostat to 18 degrees, enables all security cameras,
        // and prints "Leaving home procedure executed".

        // TODO: Implement a method `arriveHome()` that turns on all lights,
        // sets the thermostat to 22 degrees, disables all security cameras,
        // and prints "Arrive home procedure executed".
    }
    
    /////////////////
    
}