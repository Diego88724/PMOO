package mailsystem;
import java.util.ArrayList;

/**
 * Class for managing mail servers
 * @author PMOO teachers and Diego Fernandez
 *
 */
public class MailServer {
	
	private ArrayList<Email> emailList;
	

	/**
	 * MailServer Constructor
	 */
	public MailServer() {
		
		emailList = new ArrayList<Email>();
		
		
	}
	
		
	/**
	 * Method that stores an Email at the end of the list
	 * @param pMail Email to be stored
	 */
	public void storeEmail(Email pMail) {
			
		emailList.add(pMail);
		
	}
	
	/**
	 * Method to show all emails stored in the server
	 */
	public void showAllEmails() {
	
		for (Email mail: emailList) {
			mail.showEmail();
		}
		
		
	}
	
	/**
	 * metodo que vacia la lista de emails del servidor
	 */
	public void resetServer() {
		
		emailList.clear();
		
	}
	
	/**
	 * metodo que devuelve la lista de emails que se han enviado a user
	 * @param user, usuario que queremos saber que emails le han enviado
	 */
	public void showInbox(String user) {
		
		for (Email mail: emailList) {
			if (mail.getReceiver() == user) {
				mail.showEmail();
			}
		}
		
	}
	
	/**
	 * metodo que devuelve la lista de emails que ha enviado user
	 * @param user, usuario del que queremos saber que emails ha enviado
	 */
	public void showSentEmails (String user) {
		
		for (Email mail: emailList) {
			if (mail.getSender() == user) {
				mail.showEmail();
			}
		}
	}
	
	/**
	 * metodo que elimina un email de la lista
	 * @param mail, email que queremos eliminar
	 */
	public void removeEamil(Email mail) {
		for (int i=0; i < emailList.size();i++) {
			if (emailList.get(i).equals(mail)) {
				emailList.remove(i);
			}
		}
	}
	
	
	
}