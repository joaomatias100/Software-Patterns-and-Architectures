package pt.utad.mei.aps.ObjectPool;

import java.util.logging.Logger;

public class PointsPool extends Pool<Point>{

    public PointsPool(int size){
        super(size);
    }
    @Override
    public void addObj() {
        this.objects.add(new Point());
    }

    @Override
    public Point get(){

        if(this.objects.isEmpty()){
            return null;
        }

        Point point = null;

        try {
            point = (Point)this.objects.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return point;
    }

    @Override
    public void leave(Point t) {
        if(t == null){
            throw new NullPointerException("Object is null");
        }

        boolean res = this.objects.offer(t);

        if(res == false){
            System.out.println("Error in point return");
        }
    }
}
