package com.lzf.springbootjpademo.primary.repository;

import com.lzf.springbootjpademo.primary.entity.Order;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 订单
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 * 凡是以find开头的都是懒加载
 * 凡是以query开头的都是非懒加载
 *
 * @author Zhenfeng Li
 */
public interface OrderRepository extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order> {
    /**
     * 懒加载全部[不进行子查询][一条sql]
     *
     * @return 返回全部
     */
    @EntityGraph(value = "Order.orderDetails", type = EntityGraph.EntityGraphType.FETCH)
    List<Order> findAllByOrderByOrderNo();

    /**
     * 非懒加载全部[进行子查询][多条sql]
     *
     * @return 返回全部
     */
    List<Order> queryAllByOrderByOrderNo();
}
