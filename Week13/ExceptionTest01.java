
public class ExceptionTest01 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("내가 고의로 만든 예외");
			throw e;
		} catch (Exception e) {
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();			// 세부 오류 사항 출력
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
	}

}
