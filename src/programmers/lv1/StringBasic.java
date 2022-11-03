package programmers.lv1;
import java.util.*;

public class StringBasic {
	String s = "ad22";
	public boolean checkString(String s) {
		int lenth = s.length();
	    
	    if(lenth == 4 || lenth == 6){
	        return s.matches("^[0-9]*$");
	    }
	    return false;
	}

}
