
import static org.junit.Assert.*;

import org.junit.Test;


public class ReturnBookDaoTest {

@Test
	public void ReturnBookDaoTest(){
	ReturnBookDao bookOp = new ReturnBookDao();
	//save(String callno,String name,String author,String publisher,int quantity)
	int test;
	assertEquals(0,test = bookOp.delete("001", 4));

	
	}
	
}