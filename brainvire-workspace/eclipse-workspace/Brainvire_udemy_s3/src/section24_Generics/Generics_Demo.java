package section24_Generics;

 class Data<T>{
	 
	 T obj;	//object of type T
	 Data (T obj)
	 {
		 this.obj=obj;
	 }
	 public T getObject()	//const
	 {
		return this.obj;
		 
	 }
	 
 }
	public class Generics_Demo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data <Integer> idata = new Data<Integer>(10);
		System.out.println(idata.getObject());
		
		Data<String> sdata = new Data<String>("Swap");
		System.out.println(sdata.getObject());


	}

}
