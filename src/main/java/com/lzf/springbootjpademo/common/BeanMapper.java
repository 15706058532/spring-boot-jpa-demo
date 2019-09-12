package com.lzf.springbootjpademo.common;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 类转换器
 * <br/>
 * Created in 2019-02-15 14:02
 *
 * @author Li Zhenfeng
 */
public class BeanMapper {
    private static Mapper mapper = new DozerBeanMapper();


    /**
     * 转对象
     */
    public static <T> T map(Object source, Class<T> destinationClass) {
        return mapper.map(source, destinationClass);
    }

    /**
     * 转对象
     */
    public static void map(Object source, Object destination) {
        mapper.map(source, destination);
    }

    /**
     * 转List
     */
    public static <T> List<T> mapList(List<?> list, Class<T> destinationClass) {
        List<T> arrayList = new ArrayList<>();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (Object obj : list) {
            arrayList.add(map(obj, destinationClass));
        }
        return arrayList;
    }
}