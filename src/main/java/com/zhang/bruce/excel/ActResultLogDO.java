package com.zhang.bruce.excel;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Accessors(chain = true)

public class ActResultLogDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String onlineseqid;

    private String businessid;

    private String becifno;

    private String ivisresult;

    private String createdby;

    private Date createddate;

    private String updateby;

    private Date updateddate;

    private String risklevel;
}
