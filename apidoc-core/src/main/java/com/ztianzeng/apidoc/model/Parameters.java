package com.ztianzeng.apidoc.model;

import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import lombok.*;

import java.lang.reflect.Type;

/**
 * 参数实体
 *
 * @author zhaotianzeng
 * @version V1.0
 * @date 2019-06-05 13:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Parameters {
    /**
     * 是否必须
     */
    private boolean required;

    /**
     * 字段名
     */
    private String name;

    /**
     * 字段描述
     */
    private String description;

    /**
     * 字段类型
     */
    private Type type;

    /**
     * Bean的原始描述
     */
    private BeanPropertyDefinition beanDescription;


    public Parameters(Type type) {
        this.type = type;
    }
}