package serviceImpl;

import java.util.*;

import domain.ArticleBean;
import service.ArticleService;

public class ArticleServiceImpl implements ArticleService{
    private List<ArticleBean> list;
    public ArticleServiceImpl() {
	list=new ArrayList<ArticleBean>();
    }
    @Override
    public void addArticle(ArticleBean param) {
	list.add(param);
	
    }
    @Override
    public ArticleBean findOne(ArticleBean param) {
	ArticleBean article = new ArticleBean();
	for(ArticleBean s : list){
	    if(param.getSeq().equals(s.getSeq())){
		article = s;
		break;
	    }
	}
	return article;
    }

    @Override
    public List<ArticleBean> findSome(ArticleBean param) {
	List<ArticleBean> list = new ArrayList<ArticleBean>();
	for(ArticleBean s : list){
	    if(param.getSeq().equals(s.getSeq())){
		list.add(s);
	    }
	}
	return list;
    }
    @Override
    public List<ArticleBean> list() {
	return list;
    }

    @Override
    public void update(ArticleBean param) {
	for(ArticleBean s : list){
	    if(param.getSeq().equals(s.getSeq())){
		s.setTitle((param.getTitle().equals(""))?s.getTitle():param.getTitle());
		s.setContent((param.getContent().equals(""))?s.getContent():param.getContent());
		break;
	    }
	}
	
    }

    @Override
    public void delete(ArticleBean param) {
	Iterator<ArticleBean> it = list.iterator();
	while(it.hasNext()){
	    if(it.next().equals(param.getSeq())){
		it.remove();
		break;
	    }
	}
	
    }

}
