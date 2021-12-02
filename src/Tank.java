public class Tank {

    int x, y = 0;
    int dir;
    int fuel;
    int r;

    public Tank(int x, int y, int f) {
        this.x = x;
        this.y = y;
        this.fuel = f;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
    }

    public Tank() {
        x=0;
        y=0;
        this.fuel = 100;
    }

    public void goForward(int i) {

        int w = getFuel(this.fuel, i);

        if (dir == 0) {
            x += w;

        } else if (dir == 1) {
            y += w;

        } else if (dir == 2) {

            x -= w;

        } else {

            y -= w;


        }
    }


    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now. ");
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public int getFuel(int fuel, int i) {



        if (i < this.fuel) {
            if (i<0){i =i*-1;}
            r = i;
            this.fuel -= r;


        } else if (i> this.fuel) {
            r = this.fuel;
            this.fuel = 0;

        } else {
            this.r = this.fuel;
            this.fuel = this.fuel -i;
        }

        return r;
    }
}
