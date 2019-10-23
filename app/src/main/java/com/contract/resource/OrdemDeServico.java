package com.contract.resource;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface OrdemDeServico {
    @GET("/ordemdeservico")
    Call<List<OrdemDeServico>> get();

    @POST("/ordemdeservico")
    Call<OrdemDeServico> post(@Body OrdemDeServico ordemDeServico);

    @PUT("/ordemdeservico/{id}")
    Call<OrdemDeServico> put(@Body OrdemDeServico ordemDeServico);

    @DELETE("/ordemdeservico/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/ordemdeservico/{id}")
    Call<OrdemDeServico> patch(Integer id, @Body OrdemDeServico ordemDeServico);

}
