package com.contract.resource;

import com.contract.model.Servico;
import com.contract.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ServicoResource {
    @GET("/servicos")
    Call<List<Servico>> get();

    @POST("/servicos")
    Call<Servico> post(@Body Servico servico);

    @PUT("/servicos/{id}")
    Call<Servico> put(@Body Servico servico);

    @DELETE("/servicos/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/servicos/{id}")
    Call<Servico> patch(Integer id, @Body Servico servico);
}
