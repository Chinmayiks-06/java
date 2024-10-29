package com.xworkz.app.newspaper.dao;

import com.xworkz.app.newspaper.dto.NewspaperDto;
import com.xworkz.app.newspaper.exception.EditorNotFoundException;
import com.xworkz.app.newspaper.exception.LanguageNotSupportedException;
import com.xworkz.app.newspaper.exception.NewsPaperNotFoundException;

public interface NewspaperDao {
    void addNewsPaper(NewspaperDto newsPaperDto);
    NewspaperDto[] getAllNewsPaper() ;
    NewspaperDto getNewsPaperByDate(String date) throws NewsPaperNotFoundException;
    NewspaperDto getNewsPaperByLang(String lang) throws NewsPaperNotFoundException;
    NewspaperDto getNewsPaperById(int id) throws NewsPaperNotFoundException;
    int getPaperNoOfPagesByLanguage(String lang) throws LanguageNotSupportedException;
    int getNoOfArticlesById(int id) throws NewsPaperNotFoundException;
    String getDateById(int id) throws NewsPaperNotFoundException;
    void updateNoOfArticlesByDate(String date, int noOfArticles) throws NewsPaperNotFoundException;
    boolean deleteNewsPaperById(int id) throws NewsPaperNotFoundException;
    String getPaperNameByLang(String lang) throws LanguageNotSupportedException;
    String getPaperNameById(int id) throws NewsPaperNotFoundException;
    String getEditorNameByPaperName(String paperName) throws EditorNotFoundException;
}
