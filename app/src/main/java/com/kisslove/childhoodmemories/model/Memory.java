package com.kisslove.childhoodmemories.model;

import java.util.Date;

/**
 * Created by ivan on 10.10.17.
 */

public class Memory {
    private long memoryId;
    private String title;
    private String description;
    private int photoId;
    private int videoId;
    private Date memoryDate;

    public Memory(String title, int photoId, Date memoryDate) {
        this.title = title;
        this.photoId = photoId;
        this.memoryDate = memoryDate;
    }

    public long getMemoryId() {
        return memoryId;
    }

    public void setMemoryId(long memoryId) {
        this.memoryId = memoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public Date getMemoryDate() {
        return memoryDate;
    }

    public void setMemoryDate(Date memoryDate) {
        this.memoryDate = memoryDate;
    }
}
