package com.contract.resource;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface OrdemDePagamento{
    @GET("/ordemdepagamento")
    Call<List<OrdemDePagamento>> get();

    @POST("/ordemdepagamento")
    Call<OrdemDePagamento> post(@Body OrdemDePagamento ordemDePagamento);

    @PUT("/ordemdepagamento/{id}")
    Call<OrdemDePagamento> put(@Body OrdemDePagamento ordemDePagamento);

    @DELETE("/ordemdepagamento/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/ordemdepagamento/{id}")
    Call<OrdemDePagamento> patch(Integer id, @Body OrdemDePagamento ordemDePagamento);

}
