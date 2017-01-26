package service;

import domain.MemberBean;

public interface MemberService {
    public void join(MemberBean member);
    public MemberBean findById(String id);
    public boolean login(MemberBean member);
    public void change(MemberBean member);
    public void remove(MemberBean member); //비밀번호 노출,공개키
}
