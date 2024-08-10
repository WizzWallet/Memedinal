package com.wizz.fi.dao.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wizz.fi.dao.enums.OrdinalStatus;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@TableName("ordinals")
@Accessors(chain = true)
public class Ordinal extends BaseModel {
    @TableField("inscription_number")
    private String inscriptionNumber;

    @TableField("inscription_id")
    private String inscriptionId;

    @TableField("content")
    private String content;

    @TableField("status")
    private OrdinalStatus status;
}