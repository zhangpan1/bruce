package com.zhang.bruce.java8;

import java.util.List;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/10 20:35
 * @Description:
 */
public class Menu {
    Long id ;
    List<Map<String,String>> menu;
    Map<String, List<GPTSysConfig>> category;


    public Map<String, List<GPTSysConfig>> getCategory() {
        return category;
    }

    public void setCategory(Map<String, List<GPTSysConfig>> category) {
        this.category = category;
    }

    public List<Map<String, String>> getMenu() {
        return menu;
    }

    public void setMenu(List<Map<String, String>> menu) {
        this.menu = menu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
