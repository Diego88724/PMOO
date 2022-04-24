package mailsystem;

/**
 * Class for simulating MailServer activity
 * @author PMOO teachers
 *
 */
public class Lab03Simulator {

	/**
	 * Main method
	 * @param args - No parameters required
	 */
	public static void main(String[] args) {
		testEmail();
		testMailServer();
	}

	/**
	 * Method to test the  Email class
	 */
	public static void testEmail() {
		
		//Create an Email instance using the Constructor with all fields
		Email email1 = new Email("name1", "name2", "Mail subject 1", "Mail text 1");
	
		//Create an email instance using the Constructor with all fields but "text"
		Email email2 = new Email("name2", "name1", "Mail subject 2");
	
		//Use all different getters on email1 and email2
		System.out.println("email1 attributes (by getters):\n");
		System.out.println("Sender: " + email1.getSender());
		System.out.println("Receiver: " + email1.getReceiver());
		System.out.println("Subject: " + email1.getSubject());
		System.out.println("Text: " + email1.getText());
	
		System.out.println("\nemail2 attributes (by getters):");
		System.out.println("Sender: " + email2.getSender());
		System.out.println("Receiver: " + email2.getReceiver());
		System.out.println("Subject: " + email2.getSubject());
		System.out.println("Text: " + email2.getText());

		//Use setter to set text in email2
		email2.setText("Mail text 2 - by setter");
	
		//Check whether the value of the text attribute has changed (by its corresponding setter)
		System.out.println("\nText: " + email2.getText() + "\n");
		
	}
	
	/**
	 * Method to test MailServer and Email classes
	 */
	public static void testMailServer() {
		
		MailServer insServer = new MailServer();
		
		Email email1 = new Email("user1","user2","Mail Subject 1");
		insServer.storeEmail(email1);
		
		Email email2 = new Email("user1","user2","Mail Subject 2");
		insServer.storeEmail(email2);
		
		Email email3 = new Email("user1","user2","Mail Subject 3");
		insServer.storeEmail(email3);
		
		Email email4 = new Email("user2","user1", "Mail Subject");
		insServer.storeEmail(email4);
		
		insServer.showAllEmails();


		
	}
	

}