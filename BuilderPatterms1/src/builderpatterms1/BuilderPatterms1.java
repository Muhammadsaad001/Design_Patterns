package builderpatterms1;

public class BuilderPatterms1 {

   public static void main(String[] args) {
        Director director = new Director();

        // Build a sports car and its manual
        CarBuilder sportsCarBuilder = new CarBuilder();
        director.constructSportsCar(sportsCarBuilder);
        Manual sportsCar = sportsCarBuilder.getResult();
        System.out.println("Sports Car built:\n" + sportsCar.getType());

        CarManualBuilder sportsCarManualBuilder = new CarManualBuilder();
        director.constructSportsCar(sportsCarManualBuilder);
        Manual sportsCarManual = sportsCarManualBuilder.getResult();
        System.out.println("\nSports Car Manual built:\n" + sportsCarManual.print());

        // Build a city car and its manual
        CarBuilder cityCarBuilder = new CarBuilder();
        director.constructCityCar(cityCarBuilder);
        Manual cityCar = cityCarBuilder.getResult();
        System.out.println("\nCity Car built:\n" + cityCar.getType());

        CarManualBuilder cityCarManualBuilder = new CarManualBuilder();
        director.constructCityCar(cityCarManualBuilder);
        Manual cityCarManual = cityCarManualBuilder.getResult();
        System.out.println("\nCity Car Manual built:\n" + cityCarManual.print());

        // Build an SUV and its manual
        CarBuilder suvBuilder = new CarBuilder();
        director.constructSUV(suvBuilder);
        Manual suv = suvBuilder.getResult();
        System.out.println("\nSUV built:\n" + suv.getType());

        CarManualBuilder suvManualBuilder = new CarManualBuilder();
        director.constructSUV(suvManualBuilder);
        Manual suvManual = suvManualBuilder.getResult();
        System.out.println("\nSUV Manual built:\n" + suvManual.print());
    }

}
