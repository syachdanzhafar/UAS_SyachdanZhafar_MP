package com.sata.izonovel.Retrofit;

import com.sata.izonovel.Model.RegisterModel;
import com.sata.izonovel.Model.UserModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface ApiEndpoint
{
    String API_KEY = "8ZQDmrtgC0RX5AVLVQV5YjyS1pA1D7Sa7HZtlTSViEA58X8CUl8mueSLqHd3Md3y";

    @Headers("api-key: "+ API_KEY)
    @POST("/action/insertOne")
    Call<RegisterModel> registerUser(@Body RegisterModel userModel);

}
