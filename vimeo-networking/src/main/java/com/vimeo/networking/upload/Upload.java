package com.vimeo.networking.upload;

import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * The representation of the upload object.
 * <p>
 * Created by restainoa on 3/27/18.
 */
@UseStag
public class Upload implements Serializable {

    private static final long serialVersionUID = 9209923316093008332L;

    /**
     * The status of the upload.
     */
    public enum Status {
        @SerializedName("complete")
        COMPLETE,
        @SerializedName("error")
        ERROR,
        @SerializedName("in_progress")
        IN_PROGRESS
    }

    @NotNull
    @SerializedName("approach")
    private String mApproach;

    @Nullable
    @SerializedName("complete_uri")
    private String mCompleteUri;

    @NotNull
    @SerializedName("form")
    private String mForm;

    @Nullable
    @SerializedName("link")
    private String mLink;

    @Nullable
    @SerializedName("redirect_url")
    private String mRedirectUrl;

    @Nullable
    @SerializedName("size")
    private Long mSize;

    @NotNull
    @SerializedName("status")
    private Status mStatus;

    @NotNull
    @SerializedName("upload_link")
    private String mUploadLink;

    @NotNull
    public String getApproach() {
        return mApproach;
    }

    void setApproach(@NotNull String approach) {
        mApproach = approach;
    }

    @Nullable
    public String getCompleteUri() {
        return mCompleteUri;
    }

    void setCompleteUri(@Nullable String completeUri) {
        mCompleteUri = completeUri;
    }

    @NotNull
    public String getForm() {
        return mForm;
    }

    void setForm(@NotNull String form) {
        mForm = form;
    }

    @Nullable
    public String getLink() {
        return mLink;
    }

    void setLink(@Nullable String link) {
        mLink = link;
    }

    @Nullable
    public String getRedirectUrl() {
        return mRedirectUrl;
    }

    void setRedirectUrl(@Nullable String redirectUrl) {
        mRedirectUrl = redirectUrl;
    }

    @Nullable
    public Long getSize() {
        return mSize;
    }

    void setSize(@Nullable Long size) {
        mSize = size;
    }

    @NotNull
    public Status getStatus() {
        return mStatus;
    }

    void setStatus(@NotNull Status status) {
        mStatus = status;
    }

    @NotNull
    public String getUploadLink() {
        return mUploadLink;
    }

    void setUploadLink(@NotNull String uploadLink) {
        mUploadLink = uploadLink;
    }
}
