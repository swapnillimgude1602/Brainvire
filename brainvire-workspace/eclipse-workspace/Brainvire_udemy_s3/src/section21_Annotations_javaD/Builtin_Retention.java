package section21_Annotations_javaD;

import java.lang.annotation.*;

//class/Runtime/source/
//itis take runtime attention so we can use retention
@Retention(RetentionPolicy.CLASS) 
@interface MyAnno1
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }

@MyAnno(name="Ajay",project="Bank")
public class Builtin_Retention
{
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}