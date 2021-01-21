package com.cc.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: jinjinwen
 * @description: 时间填充
 * @date: 2021-01-20 13:57
 **/
@Component
public class MybatisPlusHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("create_time",new Date(),metaObject);
        this.setFieldValByName("updata_time",new Date(),metaObject);

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updata_time",new Date(),metaObject);
    }
}
