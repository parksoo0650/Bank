package service;

import java.util.*;

import domain.ArticleBean;

public interface ArticleService{
    public void addArticle(ArticleBean param);
    public ArticleBean findOne(ArticleBean param);
    public Vector<ArticleBean> findSome(ArticleBean param);
    public Vector<ArticleBean> list();
    public void update(ArticleBean param);
    public void delete(ArticleBean param);
}
