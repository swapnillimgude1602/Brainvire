package section21_Annotations_javaD;

class My<T>{
    /*
 @SafeVarargs is use for define the variable argument in the method   
 
    
    */
    @SafeVarargs
    private void show(T...arg){
        for(T x:arg)System.out.println(x);
    }
            
}
public class Safevarargs {
    public static void main(String[] args) {
        
    }
    
}