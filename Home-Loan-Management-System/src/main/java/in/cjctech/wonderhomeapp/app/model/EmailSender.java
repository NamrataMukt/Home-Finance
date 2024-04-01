package in.cjctech.wonderhomeapp.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailSender {

	private String toMail;
	private String subject;
	private String text;

}
