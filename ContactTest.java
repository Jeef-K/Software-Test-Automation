package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ContactTest {

	@Test
	public void testValidContactId() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        assertEquals("9876543210", contact.getContactId());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidContactId() {
		Contact contact = new Contact("9876543210123", "Alice", "Johnson", "5551234567", "789 Ave");
	}

	
	
	@Test
	public void testValidFirstName() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        assertEquals("Alice", contact.getFirstName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidFirstName() {
		Contact contact = new Contact("9876543210", "Aliceeeeeee", "Johnson", "5551234567", "789 Ave");
	}

	@Test
	public void testValidLastName() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        assertEquals("Johnson", contact.getLastName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidLastName() {
		Contact contact = new Contact("9876543210", "Alice", "Johnsonnnnnn", "5551234567", "789 Ave");
	}

	@Test
	public void testValidPhoneNumer() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        assertEquals("5551234567", contact.getPhone());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidPhoneNumer() {
		Contact contact = new Contact("987654321010", "Alice", "Johnson", "5551234567", "789 Ave");
	}

	@Test
	public void testValidAddress() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        assertEquals("789 Ave", contact.getAddress());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAddress() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Oak Ave");
	}
	
}
