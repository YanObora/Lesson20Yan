enum DrinksMachine {

    COFFEE, TEA, LEMONADE, MOCHITO, MINERAL_WATER, COCA_COLA;

}

class Drinks {

    public static final double COFFEE_PRICE = 2.0;

    public static final double TEA_PRICE = 1.5;

    public static final double LEMONADE_PRICE = 2.5;

    public static final double MOCHITO_PRICE = 3.0;

    public static final double MINERAL_WATER_PRICE = 1.0;

    public static final double COCA_COLA_PRICE = 2.0;

    private static double totalAmount = 0.0;

    private static int totalDrinks = 0;

    public static void makeDrink(DrinksMachine drink) {

        switch (drink) {

            case COFFEE:

                System.out.println("Making coffee...");

                break;

            case TEA:

                System.out.println("Making tea...");

                break;

            case LEMONADE:

                System.out.println("Making lemonade...");

                break;

            case MOCHITO:

                System.out.println("Making mochito...");

                break;

            case MINERAL_WATER:

                System.out.println("Making mineral water...");

                break;

            case COCA_COLA:

                System.out.println("Making Coca Cola...");

                break;

            default:

                System.out.println("Invalid drink choice.");

        }

        totalDrinks++;

    }

    public static void calculateTotalAmount(DrinksMachine drink) {

        switch (drink) {

            case COFFEE:

                totalAmount += COFFEE_PRICE;

                break;

            case TEA:

                totalAmount += TEA_PRICE;

                break;

            case LEMONADE:

                totalAmount += LEMONADE_PRICE;

                break;

            case MOCHITO:

                totalAmount += MOCHITO_PRICE;

                break;

            case MINERAL_WATER:

                totalAmount += MINERAL_WATER_PRICE;

                break;

            case COCA_COLA:

                totalAmount += COCA_COLA_PRICE;

                break;
        }
    }

    public static void displayTotal() {

        System.out.println("Total drinks: " + totalDrinks);

        System.out.println("Total amount: " + totalAmount);

    }

}



