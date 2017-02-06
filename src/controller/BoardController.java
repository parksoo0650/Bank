package controller;
import java.util.*;
import domain.ArticleBean;
import service.ArticleService;
import serviceImpl.ArticleServiceImpl;
//1.추가..주어진 BbsBean 값을 vec 에 추가하기
//1,James,Hello,2016-2-6 17:30
//2,Tom,Hi,2016-8-6 17:30
//3,Alex,Good Morning,2016-11-20 17:30
//4,Betty,I'm happy,2016-12-25 17:30
//5,John,Thank you,2017-2-6 17:30
//2.검색(1)..seq가 1인 글 검색, 
//해당 seq 가 있으면 내용을 보여주고
//없으면 해당글이 존재하지 않는다고 출력함
//3.검색(some)...
//James 가 쓴 글 검색
//하나라도 없으면 해당글이 존재하지 않는다고 출력함
//4.전체 출력
//글이 하나도 없으면
//빈 게시판 이라고 출력함
//5.수정 (seq가 1인 글의 내용을 Good Bye)로 변경
//수정이 끝나면 바뀐 글내용 출력하기
//6.삭제 (seq가 인 글을 삭제)
//삭제가 끝나면 해당글이 없다고 출력함
public class BoardController {
    public static void main(String[] args) {
	Vector<ArticleBean> list = new Vector<ArticleBean>(10,10);
	ArticleService service = new ArticleServiceImpl();
	// 0.리스트 스펙보기
	//System.out.println("CAPA" + list.capacity());
	//System.out.println("SIZE" + list.size());
	// 1.추가..주어진 BbsBean 값을 vec 에 추가하기
	ArticleBean a = new ArticleBean();
	a.setSeq("1");
	a.setUid("James");
	a.setTitle("Hello");
	a.setRegdate("2016-2-6 17:30");
	list.add(a);
	a = new ArticleBean();
	a.setSeq("2");
	a.setUid("Tom");
	a.setTitle("Hi");
	a.setRegdate("2016-8-6 17:30");
	list.add(a);
	a = new ArticleBean();
	a.setSeq("3");
	a.setUid("Alex");
	a.setTitle("Good Morning");
	a.setRegdate("2016-12-25 17:30");
	list.add(a);
	a = new ArticleBean();
	a.setSeq("4");
	a.setUid("Betty");
	a.setTitle("I'm happy");
	a.setRegdate("2016-12-25 17:30");
	list.add(a);
	a = new ArticleBean();
	a.setSeq("5");
	a.setUid("John");
	a.setTitle("Thank you");
	a.setRegdate("2017-2-6 17:30");
	list.add(a);
	a = new ArticleBean();
	a.setSeq("6");
	a.setUid("James");
	a.setTitle("Hello");
	a.setRegdate("2016-2-6 17:30");
	list.add(a);
	service.addArticle(a);
	// 2-1.검색(1)..맨 마지막의 추가한 글 검색, 
	
	
	// 2-2.검색(1)...seq가 3인 글 검색,
	Set<ArticleBean> set=new HashSet<ArticleBean>();
	for(int i=0; i<list.size();i++){
	    if("3".equals(list.get(i).getSeq())){
		set.add(list.get(i));
		break;
	    }
	}
	System.out.println(set.toString());
	// 2-3.검색(some)...James 가 쓴 글 검색
	for(int i=0; i<list.size(); i++){
	    if("James".equals(list.get(i).getUid())){
		set.add(list.get(i));
	    }
	}
	System.out.println(set.toString());
	// 4.전체 출력
	System.out.println(list);
	// 5.수정 (seq가 1인 글의 내용을 Good Bye)로 변경
	set = new  HashSet<ArticleBean>();
	                      
	for(int i=0; i<list.size();i++){
	    if("1".equals(list.get(i).getSeq())){
		list.get(i).setTitle("Good Bye");
	    }
	}  
	// 수정이 끝나면 바뀐 글내용 출력하기
	System.out.println(list);
	// 6.삭제 (seq가 3인 글을 삭제)
	Iterator<ArticleBean>it = list.iterator();
	while(it.hasNext()){
	    if(it.next().getSeq().equals("3")){
		it.remove();
	    }
	}
	System.out.println(list);
	// 삭제가 끝나면 해당글이 없다고 출력함
    }
}
