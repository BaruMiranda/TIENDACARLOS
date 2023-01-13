package com.projects.comercialcarlos.util;

import com.projects.comercialcarlos.Retrofit.model.Inventarios;
import com.projects.comercialcarlos.Retrofit.model.Productos;
import com.projects.comercialcarlos.Retrofit.model.Ventas;

import java.util.ArrayList;
import java.util.List;

public class Constantes {

    public static final String TAG_HOME = "Principal";
    public static final String EMPTY_STRING = "";

    public static final String HINT_BUSCAR = "BUSCAR";
    public static final String F_SEARCH = "BUSCAR";

    public static List<Productos> lstAdjuntoCargaCCMN = new ArrayList<>();
    public static List<Productos> lstAdjuntoCargaCCMNMas = new ArrayList<>();
    public static Integer countCarga = 0;

    public static List<Inventarios> lstInventarios = new ArrayList<>();
    public static List<Inventarios> newLstInventarios = new ArrayList<>();

    public static List<Ventas> getpciList = new ArrayList<>();
    public static List<Ventas> getLstPciCarga = new ArrayList<>();
}
