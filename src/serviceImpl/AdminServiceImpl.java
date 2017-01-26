package serviceImpl;

import domain.MemberBean;
import service.AdminService;
public class AdminServiceImpl implements AdminService{
    private MemberBean member;
    private MemberBean[] arr;
    private MemberBean[] temp;
    private int count;
    public AdminServiceImpl() {
	member = new MemberBean();
	count=0;
	arr = new MemberBean[count];
    }
    @Override
    public void regist(MemberBean member) {
	// 회원정보를 입력한 후 배열에 저장하기
	// 이름, 이이디
	if(count == arr.length){
	    MemberBean[] temp = new MemberBean[count+10];
	    //System.arraycopy(arr, 0, temp, 0, count);
	    for(int i=0; i<count; i++){
		temp[i]=arr[i];
	    }
	    arr = temp;
	}
	arr[count]=member;
	count++;
    }
    @Override
    public MemberBean findById(String id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public MemberBean[] findByName(String name) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int countByName(String name) {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public MemberBean[] list() {
	//전체목록 출력
	//arr[count].setName("회원이 존재합니다.");
	    return arr;
    }
    @Override
    public int count() {
	
	return count;
    }

    @Override
    public void changeRank(MemberBean member) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void remove(MemberBean member) {
	// TODO Auto-generated method stub
	
    }

}
