package example.lab;


public class XpowerY {

    static public long power(int x , int y){
        long pow = 1L;
        for(int i=0; i<y;i++){
            pow *= x;
        }

        return pow;

    }
    static public double power(int x, float y){
        return Math.pow(x,y);
    }

    static public double power(float x, int y){
        return Math.pow(x,y);
    }

    static public double power(float x, float y){
        return Math.pow(x,y);
    }



    static public void main(String args[]){
        int x1 = 2;
        int y1 = 3;

        System.out.println( x1 + " to the power of " + y1 + " is : " + power(x1,y1));

        int x2 = 2;
        float y2 = 2.5f;
        System.out.println(x2 + " to the power of " + y2 + " is : " + power(x2,y2));

        float x3 = 1.5f;
        int y3 = 2;
        System.out.println(x3 + " to The power of " + y3 + " is : " + power(x3,y3));

        float x4 = 2.5f;
        float y4 = 2.5f;
        System.out.println(x4 + " to the power of " + y4 + " is : " + power(x4,y4));




    }
}
