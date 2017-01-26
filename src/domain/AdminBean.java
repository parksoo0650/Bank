package domain;

public class AdminBean extends MemberBean{
    private String permission;
    public void setPermission(String permission){
	this.permission=permission;
    }
    public String sgtPermission(){
  	return permission;
    }

    public String toString() {
	// TODO Auto-generated method stub
	return String.format("%s(%s)[ %s | %s | **** | %s | %s | %s ]",
		name,ssn,password,profileImg,phone,email);
    }
  
}
