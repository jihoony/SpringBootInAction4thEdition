package readinglist;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="amazon") // 프로퍼티 주입 
public class AmazoneProperties {
	private String associatedId;

	public String getAssociatedId() {
		return associatedId;
	}

	public void setAssociatedId(String associatedId) {
		this.associatedId = associatedId;
	}
}
