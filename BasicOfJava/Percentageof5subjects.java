package BasicOfJava;

public class Percentageof5subjects {
    public static void main(String[] args){
        //Highest marks is 60
        // Code for calculate percentage
        double x1 = 60; //Math
        double x2 = 60; //Chemistry
        double x3 = 60; //English
        double x4 = 60; //Biology
        double x5 = 60; //Physics
        double p = ((x1/60 + x2/60 + x3/60 + x4/60 +x5/60)/5)*100;
        System.out.println(p);
    }
}