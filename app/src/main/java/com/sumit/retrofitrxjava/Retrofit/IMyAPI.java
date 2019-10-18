package com.sumit.retrofitrxjava.Retrofit;



import com.sumit.retrofitrxjava.Model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface IMyAPI {
    @GET("posts.php")
    Observable<List<Post>> getPosts();
}
