package DemoSerialization_Deseralization;

import java.io.Serializable;

public class DemoUser implements Serializable {
	public int userId;
	public String userName;

	DemoUser(int adduserId, String adduserName){
		this.userId=adduserId;
		this.userName=adduserName;
	}
}
