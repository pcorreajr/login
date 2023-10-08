package com.example.login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("Usuarios/login")
    Call<JwtResponse> login(@Body LoginRequest loginRequest);
}
