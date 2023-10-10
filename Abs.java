public abstract class Abs  
{
    abstract void start();
    void run()
    {
        System.out.println("in Abs Runing......");
    }
}
  class subclass extends Abs
 {
    void start()
    {
        System.out.println("in sybclass's start");
    }
 }
