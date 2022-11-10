public class instances
{
    static int count;
    static int id;

    public instances()
    {
        count++;
    }
    public static void main(String [] a)
    {
        Instances t1=new instances();
        Instances t2=new instances();
        Instances t3=new instances();
        Instances t4=new instances();
        t1=null;
        t2=null;
        Runtime.getRuntime().gc();
        System.out.println("Object created:"+count);
        System.out.println("Object destroyed:"+id);
        System.out.println("Object alive:"+(count-id));




    }
    protected void finalize()
    {
        id++;
    }
}