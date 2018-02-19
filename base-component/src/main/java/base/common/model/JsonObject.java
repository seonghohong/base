package base.common.model;

/**
 * 
 * <pre>
 * base.common.model 
 *    |_ JsonObject.java
 * 
 * </pre>
 * @date : 2018. 2. 19. 오후 4:13:39
 * @version : 1.0
 * @author : HongSeongho
 */
public class JsonObject {

	/**
	 * 성공여부
	 */
	public boolean IsSucceed = false;			
	/**
	 * 성공시 반환 데이터 ArrayLength
	 */
	public int TotalSize;						
	/**
	 * 성공시 반환 데이터
	 */
	public Object Data;							
	/**
	 * 성공시 나타낼 팝업 메시지
	 */
	public String InfoLayoutMessage;			
	/**
	 * 성공시 나타낼 Noti
	 */
	public String Notification;					
	/**
	 * 오류 코드 번호
	 */
	public String ErrorNumber;					
	/**
	 * 오류 사유
	 */
	public String ErrorCause;				
	/**
	 * 오류 메시지 상세
	 */
	public String ErrorMessage;				
	/**
	 * 페이지 이동 URL
	 */
	public String RedirectUrl;
	/**
	 * 강제 페이지 이동 URL
	 */
	public String ForcedRedirectUrl;
	
}
