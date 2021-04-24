package HM.marchTwentySix.AirTransport;

import HM.marchTwentySix.Transport;
import HM.marchTwentySix.enums.MobileMark;

public class AirTransport extends Transport {
    protected int wingspan; // в метрах
    protected int minRunwayLength;

    public AirTransport(int power, int maxSpeed, int mass, MobileMark mark, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, mass, mark);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

}
