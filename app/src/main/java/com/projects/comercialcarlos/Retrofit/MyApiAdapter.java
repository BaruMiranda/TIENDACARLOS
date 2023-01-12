package com.projects.comercialcarlos.Retrofit;

import com.projects.comercialcarlos.Retrofit.model.ApiClientesService;
import com.projects.comercialcarlos.Retrofit.model.ApiInventariosService;
import com.projects.comercialcarlos.Retrofit.model.ApiProductosService;
import com.projects.comercialcarlos.Retrofit.model.ApiProveedoresService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApiAdapter {

    private static ApiProductosService API_SERVICE;
    private static ApiInventariosService API_SERVICE_INVENTARIOS;
    private static ApiProveedoresService API_SERVICE_PROVEEDORES;
    private static ApiClientesService API_SERVICE_CLIENTES;

    /**
     * Localhost IP for AVD emulators: 10.0.2.2
     */
    private static final String BASE_URL = "http://192.168.1.47:80/microservicios/";

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
    public static ApiInventariosService getApiInventariosService() {
        // Creamos un interceptor y le indicamos el log level a usar
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Asociamos el interceptor a las peticiones
        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if (API_SERVICE_INVENTARIOS == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()) // <-- set log level
                    .build();

            API_SERVICE_INVENTARIOS = retrofit.create(ApiInventariosService.class);
        }

        return API_SERVICE_INVENTARIOS;
    }
    public static ApiProveedoresService getApiProveedoresService() {
        // Creamos un interceptor y le indicamos el log level a usar
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Asociamos el interceptor a las peticiones
        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if (API_SERVICE_PROVEEDORES == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()) // <-- set log level
                    .build();

            API_SERVICE_PROVEEDORES = retrofit.create(ApiProveedoresService.class);
        }

        return API_SERVICE_PROVEEDORES;
    }
    public static ApiClientesService getApiClientesService() {
        // Creamos un interceptor y le indicamos el log level a usar
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Asociamos el interceptor a las peticiones
        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if (API_SERVICE_CLIENTES == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()) // <-- set log level
                    .build();

            API_SERVICE_CLIENTES = retrofit.create(ApiClientesService.class);
        }

        return API_SERVICE_CLIENTES;
    }
}