package com.example.android.newsapp;

/**
 * Created by MariamNKinene on 03/07/2017.
 */

public class News {

    // The articles title
    private String mHeadTitle;

    // The section the article belongs to
    private String mSectionName;

    // The articles URL
    private String mNewsURL;

    // The articles publication date & time
    private String mPublicationDate;

    /**
     * Create a new News object
     *
     * @param headTitle       is the article's title
     * @param sectionName     is the section the article belongs to
     * @param newsURL         is the article's webpage Url
     * @param publicationDate is the article's publication date
     */

    public News(String sectionName, String publicationDate, String headTitle, String newsURL) {
        mHeadTitle = headTitle;
        mSectionName = sectionName;
        mNewsURL = newsURL;
        mPublicationDate = publicationDate;
    }

    // Get the title of the article and return it
    public String getHeadTitle() {
        return mHeadTitle;
    }

    // Get the section the article belongs to and return it
    public String getSectionName() {
        return mSectionName;
    }

    // Get the URL for the articles webpage and return it
    public String getNewsURL() {
        return mNewsURL;
    }

    //Get the publication date & time and return it
    public String getPublicationDate() {
        return mPublicationDate;
    }
}
