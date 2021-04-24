package HM.marchTwentySix.AirTransport;

import HM.marchTwentySix.enums.MobileMark;

public class WarPlane extends AirTransport {
    protected boolean hasABailoutSystem;
    protected int amountOfMissiles;

    public WarPlane(int power, int maxSpeed, int mass, MobileMark mark, int wingspan, int minRunwayLength, boolean hasABailoutSystem, int amountOfMissiles) {
        super(power, maxSpeed, mass, mark, wingspan, minRunwayLength);
        this.hasABailoutSystem = hasABailoutSystem;
        this.amountOfMissiles = amountOfMissiles;
    }

    public boolean isHasABailoutSystem() {
        return hasABailoutSystem;
    }

    public int getAmountOfMissiles() {
        return amountOfMissiles;
    }

    @Override
    public String toString() {
        return "Военный самолет:" +
                "\nСистема катапультирования: " + hasABailoutSystem +
                "\nКоличество ракет на борту: " + amountOfMissiles +
                " шт.\nРазмах крыльев самолета:" + wingspan +
                "м.\nМинимальная длина взлетно-посадочной полосы для взлета: " + minRunwayLength +
                "м.\nМощность двигателя: " + power +
                "л/с.\nМаксимальная скорость:" + maxSpeed +
                "км/ч.\nМасса: " + mass +
                "кг.\n Марка:" + mark +
                "\nМощность в килловатах: " + getPowerInKW() + "кВ.";
    }

    public void shot(){
        if(getAmountOfMissiles() > 0){
            amountOfMissiles--;
            System.out.println("Ракета пошла");
        }
        else{
            System.out.println("Боеприпасы отсуствуют");
        }
    }
    public void bailout(){
        if(isHasABailoutSystem()){
            System.out.println("Катапультирование прошло успешно");
        }
        else{
            System.out.println("У вас нет системы катапультирования");
        }
    }
}
