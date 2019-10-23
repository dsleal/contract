package com.contract.resource;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface SolicitacaoDeServico {
    @GET("/solicitacaodeservico")
    Call<List<SolicitacaoDeServico>> get();

    @POST("/solicitacaodeservico")
    Call<SolicitacaoDeServico> post(@Body SolicitacaoDeServico solicitacaoDeServico);

    @PUT("/solicitacaodeservico/{id}")
    Call<SolicitacaoDeServico> put(@Body SolicitacaoDeServico solicitacaoDeServico);

    @DELETE("/solicitacaodeservico/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/solicitacaodeservico/{id}")
    Call<SolicitacaoDeServico> patch(Integer id, @Body SolicitacaoDeServico solicitacaoDeServico);

}
