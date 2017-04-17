import static org.junit.Assert.*;

import org.junit.Test;


public class IssueBookDaoTestCheck {

	
	@Test
	public void IssueBookDaoTestCheck(){
		IssueBookDao issueOp = new IssueBookDao();
	//save(String callno,String name,String author,String publisher,int quantity)
	boolean test;
	assertEquals(true,test = issueOp.checkBook("A@4"));

	

	
}
	
	
	
}





