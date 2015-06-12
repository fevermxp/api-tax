package com.gree.gree_x.model;

public class DocImageFile extends BaseModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer docid;

    private Integer imagefileid;

    private String imagefilename;

    private String imagefiledesc;

    private Integer imagefilewidth;

    private Integer imagefileheight;

    private Integer imagefielsize;

    private String docfiletype;

    private Integer versionid;

    private String versiondetail;

    private String isextfile;

    private String hasusedtemplet;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

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

    public String getImagefiledesc() {
        return imagefiledesc;
    }

    public void setImagefiledesc(String imagefiledesc) {
        this.imagefiledesc = imagefiledesc == null ? null : imagefiledesc.trim();
    }

    public Integer getImagefilewidth() {
        return imagefilewidth;
    }

    public void setImagefilewidth(Integer imagefilewidth) {
        this.imagefilewidth = imagefilewidth;
    }

    public Integer getImagefileheight() {
        return imagefileheight;
    }

    public void setImagefileheight(Integer imagefileheight) {
        this.imagefileheight = imagefileheight;
    }

    public Integer getImagefielsize() {
        return imagefielsize;
    }

    public void setImagefielsize(Integer imagefielsize) {
        this.imagefielsize = imagefielsize;
    }

    public String getDocfiletype() {
        return docfiletype;
    }

    public void setDocfiletype(String docfiletype) {
        this.docfiletype = docfiletype == null ? null : docfiletype.trim();
    }

    public Integer getVersionid() {
        return versionid;
    }

    public void setVersionid(Integer versionid) {
        this.versionid = versionid;
    }

    public String getVersiondetail() {
        return versiondetail;
    }

    public void setVersiondetail(String versiondetail) {
        this.versiondetail = versiondetail == null ? null : versiondetail.trim();
    }

    public String getIsextfile() {
        return isextfile;
    }

    public void setIsextfile(String isextfile) {
        this.isextfile = isextfile == null ? null : isextfile.trim();
    }

    public String getHasusedtemplet() {
        return hasusedtemplet;
    }

    public void setHasusedtemplet(String hasusedtemplet) {
        this.hasusedtemplet = hasusedtemplet == null ? null : hasusedtemplet.trim();
    }
}