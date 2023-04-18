package com.cydeo.pojo;

import lombok.*;

@Getter
@Setter
@ToString
public class Link {
    private String rel;
    private String href;


}
/*
{
            "region_id": 1,
            "region_name": "Europe",
            "links": [
                {
                    "rel": "self",
                    "href": "http://54.161.232.48:1000/ords/hr/regions/1"
                }
            ]
        }
 */