package serviceImpl;

import java.util.Vector;

import domain.ArticleBean;
import service.ArticleService;

public class ArticleServiceImpl implements ArticleService{
    private Vector<ArticleBean> list;
    public ArticleServiceImpl() {
	list=new Vector<ArticleBean>(100,10);
	
    }
    @Override
    public void addArticle(ArticleBean param) {
	
	
    }

    @Override
    public ArticleBean findOne(ArticleBean param) {
	// TODO Auto-generated method stub
	ArticleBean article = new ArticleBean();
	return article;
    }

    @Override
    public Vector<ArticleBean> findSome(ArticleBean param) {
	Vector<ArticleBean> list = new Vector<ArticleBean>();
	return list;
    }
    @Override
    public Vector<ArticleBean> list() {
	Vector<ArticleBean> list = new Vector<ArticleBean>();
	return list;
    }

    @Override
    public void update(ArticleBean param) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void delete(ArticleBean param) {
	// TODO Auto-generated method stub
	
    }

}
