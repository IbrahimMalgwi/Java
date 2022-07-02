package deitelExcersise;

public class CalculatePrice {
    private int price;

    public int price(int copy){
        int price = 0;
        if (copy >= 1 && copy <= 4){
            price = copy * 2000;
        }
        if (copy >=5 && copy <= 9){
            price = copy * 1800;
        }
        if (copy >= 10 && copy <= 29){
            price = copy * 1600;
        }
        if (copy >= 30 && copy <= 49){
            price = copy * 1500;
        }
        if (copy >= 50 && copy <=99){
            price = copy * 1300;
        }
        if (copy >= 100 && copy <= 199){
            price = copy * 1200;
        }
        if (copy >= 200 && copy <= 499){
            price = copy * 1100;
        }
        if (copy >= 500){
            price = copy * 1000;
        }
        return price;
    }
}
