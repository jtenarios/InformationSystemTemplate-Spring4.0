
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;

@Entity
@Access(AccessType.PROPERTY)
@Table(uniqueConstraints = {
	@UniqueConstraint(columnNames = "word")
})
public class SpamWord extends DomainEntity {

	// Attributes -------------------------------------------------------------

	private String	word;


	@NotBlank
	@SafeHtml
	public String getWord() {
		return this.word;
	}

	public void setWord(final String word) {
		this.word = word;
	}

	// Relationships ----------------------------------------------------------

}
