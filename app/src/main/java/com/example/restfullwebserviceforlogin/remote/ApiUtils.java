package com.example.restfullwebserviceforlogin.remote;

public class ApiUtils {

    public static final String BASE_URL = "http://192.168.20.110./demo/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
