/** @author swapnillimgude
	 *  @version 2.0
	 *  @since 2015
	 **/
package section21_Annotations_javaD;

/**
 * 
 * @author swapnillimgude
 * 
 * Class for Library Book
 */
public class Book_JDoc {
	    
	    /**
	     * @value 10 default value
	     */
	    static int val=10;
	    
	    
	    /**
	     * Parameterized Constructor
	     * @param s Book Name
	     */
	    
	    public Book_JDoc(String s){
	    }
	  
	    /**
	     * Issue a Book to a Student
	     * @param roll roll number of a Student
	     * @throws Exception if book is not available, throws Exception
	     */
	    public void issue(int roll) throws Exception{
	    }
	    
	    /**
	     * Check if book is available
	     * @param str Book Name
	     * @return if book is available returns true else false
	     */
	    public boolean available(String str){
	        return true;
	    }
	    
	    /**
	     * Get Book name
	     * @param id book id
	     * @return returns book name
	     */
	    public String getName(int id){       
	        return "";
	    }
	}

