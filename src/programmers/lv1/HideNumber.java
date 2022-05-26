package programmers.lv1;

public class HideNumber {
	// 뒷 4자리를 제외한 모든 숫자 *로 가리기
	// phone_number는 길이 4 이상, 20이하인 문자열입니다.
	public static void main(String[] args) {
		
		String phone_number = "123456";
		String answer = "";
		String back = phone_number.substring(phone_number.length()-4, phone_number.length());
		
		for (int i = 0; i < phone_number.length()-4; i++) {
			answer += "*";
		}
		answer += back;
		System.out.println(answer);

	}

}
