package com.zt.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * smbms_role
 * @author 
 */
@Data
public class SmbmsRole implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 角色编码
     */
    private String rolecode;

    /**
     * 角色名称
     */
    private String rolename;

    /**
     * 创建者
     */
    private Long createdby;

    /**
     * 创建时间
     */
    private Date creationdate;

    /**
     * 修改者
     */
    private Long modifyby;

    /**
     * 修改时间
     */
    private Date modifydate;

    private static final long serialVersionUID = 1L;
}