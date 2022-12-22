package com.projects.comercialcarlos.Retrofit;

import com.projects.comercialcarlos.Retrofit.model.ApiProductosService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApiAdapter {

    private static ApiProductosService API_SERVICE;

    /**
     * Localhost IP for AVD emulators: 10.0.2.2
     */
    private static final String BASE_URL = "http://127.0.0.1:80/microservicios/";

    public static ApiProductosService getApiService() {
        // Creamos un interceptor y le indicamos el log level a usar
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Asociamos el interceptor a las peticiones
        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()) // <-- set log level
                    .build();

            API_SERVICE = retrofit.create(ApiProductosService.class);
        }

        return API_SERVICE;
    }

}