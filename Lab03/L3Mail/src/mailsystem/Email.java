package mailsystem;

public class Email {

	
	private String sender;
	private String receiver;
	private String subject;
	private String text;
	
	/**
	 * Constructora que recibe un parámetro por cada atributo de la clase
	 * @param sender, mail sender
	 * @param receiver, mail receiver
	 * @param subject, mail subject
	 * @param text, mail text
	 */
	public Email(String sender, String receiver, String subject, String text) {
		this.sender = sender;
		this.receiver = receiver;
		this.subject = subject;
		this.text = text;
	}
	
	
	/**
	 * Constructora que recibe como parámetros otros atributos, dejando el texto en blanco
	 * @param sender, mail sender
	 * @param receiver, mail receiver
	 * @param subject, mail subject
	 */
	public Email(String sender, String receiver, String subject) {
		this.sender = sender;
		this.receiver = receiver;
		this.subject = subject;
		text = "";
	}
	
	
	/**
	 *  returns the mail sender
	 * @return el sender
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * returns the mail receiver
	 * @return el receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * returns the mail subject
	 * @return el subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * returns the mail text
	 * @return el text
	 */
	public String getText() {
		return text;
	}

	/**
	 * modifies mail text
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
	
	/**
	 * metodo que muestra por pantalla el contenido del email
	 */
	public void showEmail() {
		
		
		System.out.println("Sender: " + sender + "\n");
		System.out.println("Receiver: + " + receiver + "\n");
		System.out.println("Subject: " + subject + "\n");
		System.out.println("Text: " + text + "\n");

	}
	
	public boolean equalsReceiver(Email emailp) {
		
		if (receiver == emailp.receiver) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
	
	
}
