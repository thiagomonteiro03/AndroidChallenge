package br.com.aisdigital.androidchallenge.remote

import br.com.aisdigital.androidchallenge.model.TeamEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TeamsService {

    @GET("/mobile/coletor/v1/lotes/{safraId}/{fazendaId}")
    suspend fun getTeams(
        @Path("safraId") safraId: String,
        @Path("fazendaId") fazendaId: String,
        @Query("CreatedRowVersion") createdRowVersion: String? = null,
        @Query("RemovedRowVersion") removedRowVersion: String? = null,
        @Query("ItensPerPage") itemsPerPage: Int,
        @Query("CurrentPage") currentPage: Int = 1
    ): List<TeamEntity>

}