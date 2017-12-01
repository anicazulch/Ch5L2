
public class CompareDriver
{
    public static void main (String[] args){
        String st1 = new String("hi");
        String st2 = new String("bye");
        
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        
        System.out.println(Compare1.largest(st1, st2));
        // compares h to b and h is bigger numerically --> positive --> return hi
        System.out.println(Compare3.largest(st1, st2));
        // returns hi again
        System.out.println(Compare3.largest(i1,i2));
        // returns 2
        //System.out.println(Compare3.largest(st1, i2));
        // compiles and returns an error bc it's comparing a string to an int
    }
}
