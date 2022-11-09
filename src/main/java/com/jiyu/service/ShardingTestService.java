package com.jiyu.service;

public interface ShardingTestService {
    void testTransaction();

    Object selectUserById(String id);
}
