package builderpatterms1;

import builderpatterms1.Director.Type;

public interface Builder {

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

    void setType(Type type);
}
