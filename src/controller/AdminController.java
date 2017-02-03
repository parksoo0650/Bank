package controller;

import javax.swing.JOptionPane;

import domain.*;
import service.AccountService;
import service.AdminService;
import serviceImpl.AccountServiceImpl;
import serviceImpl.AdminServiceImpl;
import enums.Butt;

public class AdminController {
    public void start() {
	MemberBean member = null;
	AccountBean account = null;
	AdminService service = new AdminServiceImpl();
	int i = 0;
	Butt[] buttons = { Butt.CLOSE, Butt.FIND_BY_ID, Butt.FIND_BY_NAME, Butt.LIST, Butt.MEM_ADD, Butt.RANK,
		Butt.DELETE };
	Butt select = (Butt) JOptionPane.showInputDialog(null, "PATIENT PAGE", "SELECT PATIEMT MENU",
		JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[1]);

	// 무조건 만들어야함, 기능이 여기 다있어서
	String ssn = "";

	/*
	 * int opt=Integer.parseInt(option); String opt2 = String.valueOf(opt);
	 */
	switch (select) { // select
	case CLOSE: // Butt에서 정의한 상수, static 점유하지 않음
	    return;
	case MEM_ADD:
	    member = new MemberBean();
	    String[] strArr = JOptionPane.showInputDialog("아이디,이름").split(",");
	    member.setUid(strArr[0]);
	    member.setName(strArr[1]);
	    service.regist(member);
	    JOptionPane.showMessageDialog(null, service.count() + "명이 등록됨");
	    // 현재 인원수는 3명입니다.
	    break;
	case FIND_BY_ID:
	    String uid = JOptionPane.showInputDialog("아이디를 입력하세요?");
	    if (service.exist(uid)) {
		JOptionPane.showMessageDialog(null, service.findById(uid).toString());
	    } else {
		JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다.");
	    }
	    break;
	case FIND_BY_NAME:
	    String name = JOptionPane.showInputDialog("이름을 입력하세요?");
	    if (service.exist(name)) {
		MemberBean[] temp = service.findByName(name);
		String templist = "";
		for (; i < temp.length; i++) {
		    templist += temp[i].toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, templist);
	    } else {
		JOptionPane.showMessageDialog(null, "이름이 존재하지 않습니다.");
	    }
	    break;
	case LIST:
	    if (service.count() == 0) {
		JOptionPane.showMessageDialog(null, "회원이 존재하지 않습니다.");
	    } else {
		MemberBean[] arr = service.list();
		String result = "";
		for (; i < service.count(); i++) {
		    result += arr[i].toString() + "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	    }
	    break;
	case RANK:
	    String temp2 = JOptionPane.showInputDialog("ID, RANK?");
	    String[] tempArr = temp2.split(",");
	    member.setUid(tempArr[0]);
	    member.setRank(tempArr[1]);
	    service.changeRank(member);
	    break;
	case DELETE:
	    service.remove(JOptionPane.showInputDialog("삭제할 아이디를 입력하세요"));
	    JOptionPane.showMessageDialog(null, "아이디가 삭제 되었습니다.");

	    break;
	}
    }
}
