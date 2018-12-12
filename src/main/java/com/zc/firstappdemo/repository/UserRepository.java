package com.zc.firstappdemo.repository;


import com.zc.firstappdemo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link User} {@link org.springframework.stereotype.Repository}
 */

@Repository
public class UserRepository {

    /**
     * storage method -> map
     */
    private final ConcurrentHashMap<Integer,User> repostory = new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator = new AtomicInteger();

    /**
     * save User
     * @param user
     * @return if success return <code>true</code>
     *          if fails return <code>false</code>
     */
    public boolean save(User user){
        //id start 1
        Integer id = idGenerator.incrementAndGet();
        user.setId(id);
        return (repostory.put(id,user)) ==null;

    }

    public Collection<User> findAll(){
        return repostory.values();
    }
}
