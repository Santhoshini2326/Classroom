import java.util.*;
public class Classroom
{
    public static void main(String[] args) {
      Details obj =new Details();
      boy obj1 = new boy();
      grl obj2 = new grl();
      obj1.fav_Sub();
      obj2.gender();  
    }
}
 class Details
 {
    public static void class_Strength()
    {
        System.out.println("class_Strength = 40");
    }
}
class boy extends Details
{
    public static void gender()
    {
        System.out.println("Gender="+"Male");
    }
    public static void fav_Sub()
    {
        System.out.println("Subject="+"Languages");
    }
    public static void class_Strength()
    {
        System.out.println("class_Strength = 20");
    }
}
class grl extends Details
{
    public static void gender()
    {
        System.out.println("Gender="+"Female");
    }
    public static void fav_Sub()
    {
        System.out.println("Subject="+"Subjects");
    }
    public static void class_Strength()
    {
        System.out.println("class_Strength = 20");
    }
}



