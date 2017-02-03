package serviceImpl;

import domain.MemberBean;
import service.AdminService;

public class AdminServiceImpl implements AdminService {
    private MemberBean member;
    private MemberBean[] arr;
    private MemberBean[] temp;
    private int count;

    public AdminServiceImpl() {
	member = new MemberBean();
	count = 0;
	arr = new MemberBean[count];
    }

    @Override
    public void regist(MemberBean member) {
	// 회원정보를 입력한 후 배열에 저장하기
	// 이름, 이이디
	if (count == arr.length) {
	    MemberBean[] temp = new MemberBean[count + 10];
	    // System.arraycopy(arr, 0, temp, 0, count);
	    for (int i = 0; i < count; i++) {
		temp[i] = arr[i];
	    }
	    arr = temp;
	}
	arr[count++] = member;
    }

    @Override
    public MemberBean findById(String id) {
	// TODO Auto-generated method stub
	MemberBean member = new MemberBean();
	for (int i = 0; i < count; i++) {
	    if (id.equals(arr[i].getUid())) {
		member = arr[i];
		break;
	    }
	}
	return member;
    }

    @Override
    public MemberBean[] findByName(String name) {
	MemberBean[] temp = new MemberBean[countByName(name)];
	for (int i = 0; i < count; i++) {
	    if (name.equals(arr[i].getName())) {
		temp[i]=arr[i];
	    }
	}
	return temp;
    }
    @Override
    public int countByName(String name) {
	int nameCount=0;
	for(int i=0; i < count; i++){
	    if (name.equals(arr[i].getName())) {
		nameCount++;
	    }
	}
	return nameCount;
    }

    @Override
    public MemberBean[] list() {
	// 전체목록 출력
	// arr[count].setName("회원이 존재합니다.");
	return arr;
    }

    @Override
    public int count() {

	return count;
    }

    @Override
    public void changeRank(MemberBean member) {
	//검증한 상태,아이디가 없을 수 없는 상황
	for(int i=0;i<count;i++){
	    if(member.getUid().equals(arr[i].getUid())){
		arr[i].setRank(member.getRank());
		break;
	    }
	}
    }

    @Override
    public void remove(String id) {
	for(int i=0;i<count;i++){
	    if(id.equals(arr[i].getUid())){
		arr[i]=arr[count-1];
		arr[count] = null;
		break;
	    }
	}
    }

    @Override
    public boolean exist(String keyword) {
	boolean flag = false;
	for (int i = 0; i < count; i++) {
	    if (keyword.equals(arr[i].getUid()) || keyword.equals(arr[i].getName())) {
		flag = true;
		break;
	    }
	}
	return flag;
    }

   


}
