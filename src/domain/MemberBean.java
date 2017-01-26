package domain;

public class MemberBean {

    protected String name, uid, ssn, password, profileImg, phone, email,rank;

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setUid(String uid) {
	this.uid = uid;
    }
    public String getUid() {
	return uid;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getName() {
	return name;
    }
    public void setSsn(String ssn) {
	this.ssn = ssn;
    }
    public String getSsn() {
	return ssn;
    }
    public void setPassword(String password) {
	this.password = password;
    }
    public String getPassword() {
	return password;
    }
    public void setProfileImg(String profileImg){
	this.profileImg=profileImg;
    }
    public String getProfileImg(){
	return profileImg;
    }
    public void setPhone(String phone){
	this.phone=phone;
    }
    public String getPhone(){
	return phone;
    }
    public void setEmail(String email){
	this.email=email;
    }
    public String getEmail(){
	return email;
    }
    public String calcGender(String ssn) {
	char ch = ssn.charAt(7);
	String gender = "";
	switch (ch) {
	case '1':
	case '3':
	    gender = "남자";
	    break;
	case '2':
	case '4':
	    gender = "여자";
	    break;
	case '5':
	case '6':
	    gender = "외국인";
	    break;
	default:
	}
	return gender;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return String.format("%s(%s)[ %s | %s | **** | %s | 관리자 ]",
		name,ssn,password,phone,email);
    }
}
