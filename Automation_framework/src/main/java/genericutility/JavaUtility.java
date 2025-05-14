package genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
	public String getSystemtTime() {
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

}
