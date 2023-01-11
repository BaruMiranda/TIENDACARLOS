package com.projects.comercialcarlos.Retrofit.model;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInventariosService {
    @GET("inventario.php")
    Call<ArrayList<Inventarios>> getInventarios();
}
