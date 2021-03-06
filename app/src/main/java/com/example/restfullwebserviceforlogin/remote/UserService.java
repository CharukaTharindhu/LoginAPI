package com.example.restfullwebserviceforlogin.remote;

import com.example.restfullwebserviceforlogin.model.ResObj;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

    @GET("login/{username}/{password})")
    Call login(@Path("username") String username, @Path("password") String password);
}
