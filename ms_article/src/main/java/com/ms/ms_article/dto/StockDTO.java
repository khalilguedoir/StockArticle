package com.ms.ms_article.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StockDTO {
    @JsonProperty("id")
    private String id;

    @JsonProperty("zone")
    private String zone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
