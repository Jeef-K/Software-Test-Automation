package ContactService;

//class to store contact information
public class Contact {
	//contactId contains a 10 character id that must that cannot be changed
    private String contactId;
    //firstName contains a string of max 10 characters
    private String firstName;
    //lastName contains a string of max 10 characters
    private String lastName;
    //phone must contain a string of exactly 10 characters
    private String phone;
    //address contains a string of max 10 characters
    private String address;
    
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId.length() <= 10 && contactId != null) {
            this.contactId = contactId;
        } else {
        	throw new IllegalArgumentException("Invalid contact ID entered");
        }
        
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhone(phone);
        this.setAddress(address);
    }

    public void setFirstName(String firstName) {
        if (firstName.length() <= 10 && firstName != null){
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Invalid first name entered");
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() <= 10 && lastName != null) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Invalid last name entered");
        }
    }

    public void setPhone(String phone) {
        if (phone.length() == 10 && phone != null) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone numer entered");
        }
    }

    public void setAddress(String address) {
        if (address.length() <= 10 && address != null) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Invalid address entered");
        }
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    
}
