package com.contract.resource;

import com.contract.model.Cliente;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ClienteResource {
    @GET("/cliente")
    Call<List<Cliente>> get();

    @POST("/cliente")
    Call<Cliente> post(@Body Cliente cliente);

    @PUT("/cliente/{id}")
    Call<Cliente> put(@Body Cliente cliente);

    @DELETE("/cliente/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/cliente/{id}")
    Call<Cliente> patch(Integer id, @Body Cliente cliente);

}
