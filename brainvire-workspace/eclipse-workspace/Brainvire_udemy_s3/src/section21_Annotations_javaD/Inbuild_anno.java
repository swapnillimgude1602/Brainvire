package section21_Annotations_javaD;

abstract class A
{
    abstract void display();
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    /* 
    Deprecated is usefor remove method for future it means we can not use deprecated allocated method
    
    
    */
    @Deprecated
    public void show()
    {
        
    }
    
}

public class Inbuild_anno
{
    
    public static void main(String[] args) 
    {
        int i;
        /*
        {
@ SuperssWarning is use for Deprecated and Unchecked (its define us to that it is throw error )       
        }
*/
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}
