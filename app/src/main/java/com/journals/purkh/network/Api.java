package com.journals.purkh.network;

import com.google.gson.JsonObject;
import com.journals.purkh.model.AbstractResponse;
import com.journals.purkh.model.ArchiveResponse;
import com.journals.purkh.model.CategoryResponse;
import com.journals.purkh.model.ContactResponse;
import com.journals.purkh.model.CurrentIssueResponse;
import com.journals.purkh.model.EditorialBoardResponse;
import com.journals.purkh.model.InPressResponse;
import com.journals.purkh.model.JournalHomeResponse;
import com.journals.purkh.model.JournalsListResponse;
import com.journals.purkh.model.VolumeIssueResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {



    @Headers("Content-Type: application/json")
    @POST("journalslistapi.php")
    Call<CategoryResponse> getCategoryList(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("aboutjournalapi.php")
    Call<JournalHomeResponse> getJournalHomeDetails(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("current-issueapi.php")
    Call<CurrentIssueResponse> getCurrentIssueList(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("inpressapi.php")
    Call<InPressResponse> getInPressList(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("archiveapi.php")
    Call<ArchiveResponse> getArchiveList(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("abstractdisplayapi.php")
    Call<AbstractResponse> getAbstractDisplay(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("vol_issueapi.php")
    Call<VolumeIssueResponse> getVolumeIssueDisplay(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("contactpagejournalsapi.php")
    Call<JournalsListResponse> getJournalListDisplay(@Body JsonObject jsonObject);


    @Headers("Content-Type: application/json")
    @POST("contactapi.php")
    Call<ContactResponse> getContactDisplay(@Body JsonObject jsonObject);

    @Headers("Content-Type: application/json")
    @POST("editorialboardapi.php")
    Call<EditorialBoardResponse> getEditorialList(@Body JsonObject jsonObject);


}
