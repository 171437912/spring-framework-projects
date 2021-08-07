package com.lyk.spring.basic_di.b_bytype.dao.impl;

import com.lyk.spring.basic_di.b_bytype.dao.DemoDao;

/**
 * @author Mr.Liu
 * @description
 * @date 2021-08-06 23:09
 */
public class DemoDaoImpl implements DemoDao {
    @Override
    public String findAll() {
        return "findAll.. run...";
    }
}
