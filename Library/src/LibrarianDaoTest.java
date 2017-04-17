import static org.junit.Assert.*;

import org.junit.Test;


public class LibrarianDaoTest {
	
	@Test
	public void LibrarianDaoTest(){
	LibrarianDao libOp = new LibrarianDao();
	//save(String name,String password,String email,String address,String city,String contact){
	int test;
	assertEquals(1,test = libOp.save("TestLib","test", "testEmail", "testAddress", "testCity","testContact"));
	int id = libOp.select("TestLib");
	assertEquals(1,test = libOp.delete(id));
}

}