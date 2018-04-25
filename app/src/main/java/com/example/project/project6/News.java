package com.example.project.project6;

public class News {


    private String mTitle;
    private String mSection;
    private String mAuthor;
    private String mDate;
    private String mUrl;


    public News(String title,  String url ) {
        mTitle= title;
        mUrl = url;
    }
    public News(String title,  String url, String section,String date ) {
        mTitle= title;
        mUrl = url;
        mSection=section;
        mDate=date;
    }
        public News(String title, String url, String section, String author,String date ) {
            mTitle= title;
            mSection = section;
            mAuthor=author;
            mDate=date;
            mUrl = url;
        }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getUrl() {
            return mUrl;
        }

}
