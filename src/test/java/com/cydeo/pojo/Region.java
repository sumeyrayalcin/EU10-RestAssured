package com.cydeo.pojo;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.*;

@Getter
@Setter
@ToString
public class Region {
    //region_id
    //if your jsonkey and variable name not matching, you can map it with jsonProperty
    @JsonProperty("region_id")
    private int rId;
    @JsonProperty("region_name")
    private String region_name;
    @JsonProperty("links")
    private List<Link> links;

}
/*
{
            "region_id": 1,               //int
            "region_name": "Europe",      //String
            "links": [                    // List of links
                {
                    "rel": "self",
                    "href": "http://54.161.232.48:1000/ords/hr/regions/1"
                }
            ]
        }
 */