package ContactService;

import java.util.ArrayList;
import ContactService.Contact;

//class to store a contact list
public class ContactService {
	ArrayList <Contact> contacts;
    
    public ContactService() {
        contacts = new ArrayList<Contact>();
    }
    
    public void addContact(Contact newContact) {
        boolean unique = true;
        for (Contact c : contacts) {
        	if (c.getContactId() == newContact.getContactId()) {
        		unique = false;
        		break;
        	}
        }
        
        if (unique) {
        	contacts.add(newContact);
        } else {
        	throw new IllegalArgumentException("Contact ID taken");
        }
    }
    
    public void removeContact(String delContact) {
    	for (Contact c : contacts) {
        	if (c.getContactId().equalsIgnoreCase(delContact)) {
        		contacts.remove(c);
        		break;
        	}
        }
    }
    
    public void updateContactFirstName(String contactID, String firstName) {
    	for (Contact c : contacts) {
        	if (c.getContactId().equalsIgnoreCase(contactID)) {
        		c.setFirstName(firstName);
        		break;
        	}
        }
    }
    
    public void updateContactLastName(String contactID, String lastName) {
    	for (Contact c : contacts) {
        	if (c.getContactId().equalsIgnoreCase(contactID)) {
        		c.setLastName(lastName);
        		break;
        	}
        }
    }
    
    public void updateContactPhoneNumer(String contactID, String phoneNumber) {
    	for (Contact c : contacts) {
        	if (c.getContactId().equalsIgnoreCase(contactID)) {
        		c.setPhone(phoneNumber);
        		break;
        	}
        }
    }
    
    public void updateContactAddress(String contactID, String address) {
    	for (Contact c : contacts) {
        	if (c.getContactId().equalsIgnoreCase(contactID)) {
        		c.setAddress(address);
        		break;
        	}
        }
    }
}
