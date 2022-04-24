package mailsystem;

/**
 * Class for managing mail servers
 * @author PMOO teachers
 *
 */
public class MailServer {
	
	//Attribute for storing emails
	private Email[] emailList;

	//Attribute for Maximum capacity
	private final int MAXIMUM_CAPACITY = 100;

	//Attribute for number of stored emails
	private int numEmails;

	/**
	 * MailServer Constructor
	 */
	public MailServer() {
		emailList= new Email[MAXIMUM_CAPACITY];
		
		
	}
	
		
	/**
	 * Method that stores an Email at the end of the list
	 * @param pMail Email to be stored
	 */
	public void storeEmail(Email pMail) {
			
		if (numEmails < MAXIMUM_CAPACITY) {
			emailList[numEmails] = pMail;
			numEmails = numEmails + 1;
		}
		
	}
	
	/**
	 * Method to show all emails stored in the server
	 */
	public void showAllEmails() {
	
		for (int i=0; i < numEmails;i++) {
			emailList[i].showEmail();
		}
		
		
	}
	
	
	
}
