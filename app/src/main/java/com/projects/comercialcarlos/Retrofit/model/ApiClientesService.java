package com.projects.comercialcarlos.Retrofit.model;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiClientesService {
    @GET("ventas.php")
    Call<ArrayList<Ventas>> getVentas();
}
