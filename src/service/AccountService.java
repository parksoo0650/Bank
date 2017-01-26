package service;
import domain.AccountBean;
public interface AccountService {
    //create
    public AccountBean createAccount(String uid, String accountType, String money);
    //read -one
    public AccountBean findByAccountNo(int accountNo);
    //read some
    public AccountBean[] findByName(String name);
    public int countByName(String name);
    //read all
    public AccountBean[] list();
    public int count();
    //read special
    public boolean checkMoney(int money);
    //update
    public String depost(int money);
    public String withdraw(int money);
    //delete
    public void drop();
}
