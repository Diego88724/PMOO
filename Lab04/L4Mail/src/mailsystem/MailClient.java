package mailsystem;

/**
 * Clase que trata los datos del cliente
 * @author Diego Fernandez
 *
 */
public class MailClient {
	
	
	private MailServer server; //servidor de correo al que el cliente se conecta
	private String userAddress;
	
	/**
	 * Constructora de la clase
	 * @param server
	 * @param userAddress
	 */
	public MailClient (MailServer server, String userAddress) {
		this.server = server;
		this.userAddress = userAddress;
	}
	
	
	
	
	/**
	 * getter del atributo userAddress
	 * @return, el valor de userAddress
	 */
	public String getUserAddress() {
		return userAddress;
	}
	
	
	
	
	/**
	 * metodo que se encarga de enviar un email con todos los datos de la cabecera
	 * @param receiver, el receptor al que queremos enviar el email
	 * @param subject, tema del email
	 * @param text, contenido del email
	 */
	public void sendEmail(String receiver, String subject, String text) {
		Email mail = new Email(userAddress, receiver, subject, text);
		server.storeEmail(mail);
	}
	
	
	/**
	 * metodo que muestra todos los emails que han sido enviados al usuario
	 */
	public void showMyInbox() {
		server.showInbox(userAddress);
	}
	
	
	
	/**
	 * metodo que muestra todos los emails que han sido enviados por el usuario
	 */
	public void showMySent() {
		server.showSentEmails(userAddress);
	}
	
	
	
}
