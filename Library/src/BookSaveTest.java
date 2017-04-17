
import static org.junit.Assert.*;

import org.junit.Test;


public class BookSaveTest {

@Test
	public void BookSaveTest(){
	BookDao bookOp = new BookDao();
	//save(String callno,String name,String author,String publisher,int quantity)
	int test;
	assertEquals(0,test = bookOp.save("001","TestRun", "DMoreira", "whatever", 12));

	
	}
	
}
