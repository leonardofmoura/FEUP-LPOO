package GameCore;

public class Position {
    private int x,y;

    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Position(){
        this.x = 0;
        this.y = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return getX() == position.getX() &&
                getY() == position.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position move(int sX, int sY){
        this.x += sX;
        this.y += sY;
        return this;
    }

    public Position move(Direction d,int speed){
        switch (d) {
            case N:
                this.y -=speed;
                break;
            case E:
                this.x+=speed;
                break;
            case S:
                this.y+=speed;
                break;
            case W:
                this.x-=speed;
                break;
            default:
                return this;
        }
        return this;
    }

    public double getdistance(Position position){
        double diffx = Math.pow(this.x - position.getX(),2);
        double diffy = Math.pow(this.y - position.getY(),2);
        return  Math.sqrt(diffx+diffy);
    }
}
