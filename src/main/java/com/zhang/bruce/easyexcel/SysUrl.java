package com.zhang.bruce.easyexcel;

import java.util.ArrayList;
import java.util.List;

public class SysUrl {
    private Integer id;

    private String url;

    private String name;

    private Integer parentId;

    private Integer level;

	private List<SysUrl> list = new ArrayList<SysUrl>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

	public List<SysUrl> getList() {
		return list;
	}

	public void setList(List<SysUrl> list) {
		this.list = list;
	}
}
