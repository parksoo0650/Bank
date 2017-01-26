package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.AccountService;
import service.AdminService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.AdminServiceImpl;

public class AdminController {
    public void start() {
	MemberBean member = null;
	AccountBean account = null;
	AdminService service = new AdminServiceImpl(); 
	int i=0;
	// 무조건 만들어야함, 기능이 여기 다있어서
	String ssn = "";
	while (true) {
	    /*
	     * int opt=Integer.parseInt(option); String opt2 =
	     * String.valueOf(opt);
	     */
	    switch (JOptionPane.showInputDialog("0.종료 1.회원등록 2.ID조회 3.이름조회 4.목록조회 5.조회 6.등급조정 7.삭제")) {
	    case "0":
		return;
	    case "1":
		member = new MemberBean();
		String[] strArr = JOptionPane.showInputDialog("아이디,이름").split(",");
		member.setUid(strArr[0]);
		member.setName(strArr[1]);
		service.regist(member);
		JOptionPane.showMessageDialog(null, service.count()+"명이 등록됨");
		//현재 인원수는 3명입니다.
		break;
	    case "3":

		break;
	    case "4":
		if(service.count()==0){
		    JOptionPane.showMessageDialog(null, "회원이 존재하지 않습니다.");
		}else{
		    MemberBean[] arr = service.list();
		    String result="";
		    for(;i<service.count();i++){
			result+=arr[i].toString()+"\n";
		    }
		    JOptionPane.showMessageDialog(null, result); 
		}
		break;
	    case "5":

		break;
	    }
	}
    }

}
