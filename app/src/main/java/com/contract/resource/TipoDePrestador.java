package com.contract.resource;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface TipoDePrestador {
    @GET("/tipodeprestador")
    Call<List<TipoDePrestador>> get();

    @POST("/tipodeprestador")
    Call<TipoDePrestador> post(@Body TipoDePrestador tpPrestador);

    @PUT("/tipodeprestador/{id}")
    Call<TipoDePrestador> put(@Body TipoDePrestador tpPrestador);

    @DELETE("/tipodeprestador/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/tipodeprestador/{id}")
    Call<TipoDePrestador> patch(Integer id, @Body TipoDePrestador tpPrestador);

}
