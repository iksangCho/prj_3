package kr.co.haerak.service.club;

import java.util.ArrayList;
import java.util.List;

import kr.co.haerak.domain.club.ClubDetailDomain;
import kr.co.haerak.domain.club.SetReviewDomain;

/**
 * ���� �������� service
 * @author user
 */
public class ShowClubService {

	
	
	
	/**
	 * ������ ������ ���� service
	 * @param clubNum
	 * @return
	 */
	public ClubDetailDomain showClubService(int clubNum) {
		
		ClubDetailDomain result=new ClubDetailDomain();
		
		return result;
	}//showClubService
	
	
	/**
	 *  ���ӻ� ���������� ���並 �������� service
	 * @param clubNum
	 * @return
	 */
	public List<SetReviewDomain> showReviewService(int clubNum) {
		
		List<SetReviewDomain> result=new ArrayList<SetReviewDomain>();
		
		
		return result;
	}//showReviewService
	
	/**
	 * ���ɻ������� Ȯ���ϴ� service
	 * @param userId
	 * @param clubNum
	 * @return
	 */
	public boolean selectInterService(String userId,int clubNum) {
		
		return true;
	}//selectInterService
	
	
	/**
	 * ��Ʈ Ŭ�� �� ���ɸ�� �߰�/����
	 * @param userId
	 * @param clubNum
	 */
	public void updateInterList(String userId,int clubNum) {
		
	}//updateInterList
	
	
	/**
	 * ���ӽ�û�ϱ�
	 * @param userId
	 * @param clubNum
	 */
	public void clubApprovalInsert(String userId,int clubNum) {
		
	}//clubapprovalInsert
	
	
	
}//ShowClubService