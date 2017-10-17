package com.app.aqoong.smsreport.data;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONArray;

/**
 * Created by aqoong on 2017. 9. 21..
 */

public class URLParser {
    private AsyncTask<Void, Void, JSONArray> mTask = null;
    private String jsonString = null;

    private String[] url = null;
    {
        url[0] = "http://openAPI.seoul.go.kr:8088/";
        // start page / end page / product category / transit type
        url[1] = "/json/SearchLostArticleService/";

    }

    public URLParser(Context context){

    }
}
