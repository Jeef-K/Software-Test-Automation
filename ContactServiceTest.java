package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class ContactServiceTest {
	
	private ContactService contactService;
	
	@Before
    public void setUp() {
        contactService = new ContactService();
    }

	@Test
	public void testAddContact() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        contactService.addContact(contact);
       assertEquals(1, contactService.contacts.size());
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void testAddDuplicateContact() {
        Contact contact1 = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        Contact contact2 = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        contactService.addContact(contact1);
        contactService.addContact(contact2);
    }

	@Test
	public void testRemoveContact() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        contactService.addContact(contact);
        contactService.removeContact("9876543210");
        assertEquals(0, contactService.contacts.size());
	}

	@Test
	public void testUpdateContactFirstName() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        contactService.addContact(contact);
        contactService.updateContactFirstName("9876543210", "Jane");
        assertEquals("Jane", contact.getFirstName());
	}

	@Test
	public void testUpdateContactLastName() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        contactService.addContact(contact);
        contactService.updateContactLastName("9876543210", "Smith");
        assertEquals("Smith", contact.getLastName());
	}

	@Test
	public void testUpdateContactPhoneNumer() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        contactService.addContact(contact);
        contactService.updateContactPhoneNumer("9876543210", "9876543210");
        assertEquals("9876543210", contact.getPhone());
	}

	@Test
	public void testUpdateContactAddress() {
		Contact contact = new Contact("9876543210", "Alice", "Johnson", "5551234567", "789 Ave");
        contactService.addContact(contact);
        contactService.updateContactAddress("9876543210", "456 Pkwy");
        assertEquals("456 Pkwy", contact.getAddress());
	}

}
