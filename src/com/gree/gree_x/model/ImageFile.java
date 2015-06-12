package com.gree.gree_x.model;

public class ImageFile extends BaseModel {
    private Integer imagefileid;

    private String imagefilename;

    private String imagefiletype;

    private Integer imagefileused;

    private String filerealpath;

    private String iszip;

    private String isencrypt;

    private String filesize;

    private Integer downloads;

    private String miniimgpath;

    private String imgsize;

    private String isftp;

    private Integer ftpconfigid;

    private byte[] imagefile;

    public Integer getImagefileid() {
        return imagefileid;
    }

    public void setImagefileid(Integer imagefileid) {
        this.imagefileid = imagefileid;
    }

    public String getImagefilename() {
        return imagefilename;
    }

    public void setImagefilename(String imagefilename) {
        this.imagefilename = imagefilename == null ? null : imagefilename.trim();
    }

    public String getImagefiletype() {
        return imagefiletype;
    }

    public void setImagefiletype(String imagefiletype) {
        this.imagefiletype = imagefiletype == null ? null : imagefiletype.trim();
    }

    public Integer getImagefileused() {
        return imagefileused;
    }

    public void setImagefileused(Integer imagefileused) {
        this.imagefileused = imagefileused;
    }

    public String getFilerealpath() {
        return filerealpath;
    }

    public void setFilerealpath(String filerealpath) {
        this.filerealpath = filerealpath == null ? null : filerealpath.trim();
    }

    public String getIszip() {
        return iszip;
    }

    public void setIszip(String iszip) {
        this.iszip = iszip == null ? null : iszip.trim();
    }

    public String getIsencrypt() {
        return isencrypt;
    }

    public void setIsencrypt(String isencrypt) {
        this.isencrypt = isencrypt == null ? null : isencrypt.trim();
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public String getMiniimgpath() {
        return miniimgpath;
    }

    public void setMiniimgpath(String miniimgpath) {
        this.miniimgpath = miniimgpath == null ? null : miniimgpath.trim();
    }

    public String getImgsize() {
        return imgsize;
    }

    public void setImgsize(String imgsize) {
        this.imgsize = imgsize == null ? null : imgsize.trim();
    }

    public String getIsftp() {
        return isftp;
    }

    public void setIsftp(String isftp) {
        this.isftp = isftp == null ? null : isftp.trim();
    }

    public Integer getFtpconfigid() {
        return ftpconfigid;
    }

    public void setFtpconfigid(Integer ftpconfigid) {
        this.ftpconfigid = ftpconfigid;
    }

    public byte[] getImagefile() {
        return imagefile;
    }

    public void setImagefile(byte[] imagefile) {
        this.imagefile = imagefile;
    }
}