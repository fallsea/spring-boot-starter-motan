package com.fallsea.demo.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 测试类
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:19:30
 */
public class Demo implements Serializable
{
    private static final long serialVersionUID = -8754007944801649212L;

    private BigDecimal id;
    
    private String name;

    public BigDecimal getId()
    {
        return id;
    }

    public void setId(BigDecimal id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    
    
}
