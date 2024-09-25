package task1;

public class CircleBox {
private  int price;
private  Rectangle CircleCake;



    public CircleBox(int price, Rectangle circleCake) {
        this.price = price;
        CircleCake = circleCake;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Rectangle getCircleCake() {
        return CircleCake;
    }

    public void setCircleCake(Rectangle circleCake) {
        CircleCake = circleCake;
    }
}
