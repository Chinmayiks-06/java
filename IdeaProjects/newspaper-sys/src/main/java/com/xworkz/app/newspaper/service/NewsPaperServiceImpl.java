package com.xworkz.app.newspaper.service;

import com.xworkz.app.newspaper.dao.NewspaperDao;
import com.xworkz.app.newspaper.dao.impl.NewspaperDaoImpl;
import com.xworkz.app.newspaper.dto.NewspaperDto;
import com.xworkz.app.newspaper.exception.EditorNotFoundException;
import com.xworkz.app.newspaper.exception.LanguageNotSupportedException;
import com.xworkz.app.newspaper.exception.NewsPaperNotFoundException;

public class NewsPaperServiceImpl implements NewspaperService {
    NewspaperDao newspaperDao = new NewspaperDaoImpl();
    @Override
    public void addNewsPaper(NewspaperDto newsPaperDto) {
        if (newsPaperDto != null) {
            newspaperDao.addNewsPaper(newsPaperDto);
        } else {
            System.out.println("Newspaper is empty");
        }
    }

    @Override
    public NewspaperDto[] getAllNewsPaper() {
        return  newspaperDao.getAllNewsPaper();
    }

    @Override
    public NewspaperDto getNewsPaperByDate(String date) throws NewsPaperNotFoundException {
        NewspaperDto newspaperDto = null;
        if(date!=null) {
            newspaperDto= newspaperDao.getNewsPaperByDate(date);
        }else System.out.println("Please enter valid date");

        return newspaperDto;
    }

    @Override
    public NewspaperDto getNewsPaperByLang(String lang) throws NewsPaperNotFoundException {


        return null;
    }

    @Override
    public NewspaperDto getNewsPaperById(int id) throws NewsPaperNotFoundException {
        return null;
    }

    @Override
    public int getPaperNoOfPagesByLanguage(String lang) throws LanguageNotSupportedException {
        return 0;
    }

    @Override
    public int getNoOfArticlesById(int id) throws NewsPaperNotFoundException {
        return 0;
    }

    @Override
    public String getDateById(int id) throws NewsPaperNotFoundException {
        return "";
    }

    @Override
    public void updateNoOfArticlesByDate(String date, int noOfArticles) throws NewsPaperNotFoundException {

    }

    @Override
    public void deleteNewsPaperById(int id) throws NewsPaperNotFoundException {

    }

    @Override
    public String getPaperNameByLang(String lang) throws LanguageNotSupportedException {
        return "";
    }

    @Override
    public String getPaperNameById(int id) throws NewsPaperNotFoundException {
        return "";
    }

    @Override
    public String getEditorNameByPaperName(String paperName) throws EditorNotFoundException {
        return "";
    }
}
