
package chatBotNlpBhortiBondhu;

import org.apache.commons.lang3.StringUtils; 

public class TestM {

	public  double compareStrings(String stringA, String stringB) {
	    return StringUtils.getJaroWinklerDistance(stringA, stringB);
	}

}
