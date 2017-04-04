package android.nnbinh.exbaseretrofit.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BinhNguyen on 4/4/2017.
 */

public class Movie {
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("original_language")
    private String originalLanguage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
