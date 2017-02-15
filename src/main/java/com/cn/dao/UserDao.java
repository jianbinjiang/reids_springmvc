package com.cn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.redis.base.AbstractBaseRedisDao;

import entity.User;
@Repository
public class UserDao extends AbstractBaseRedisDao<String, User> implements IUserDao {

	@Override
	public boolean add(final User user) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {

			@Override
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = getRedisSerializer();
				byte[] key = serializer.serialize(user.getId());
				byte[] name = serializer.serialize(user.getName());
				return connection.setNX(key, name);
			}
		});
	        return result; 
	}

	@Override
	public boolean add(final List<User> list) {
		  Assert.notEmpty(list);  
	        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {  
	            public Boolean doInRedis(RedisConnection connection)  
	                    throws DataAccessException {  
	                RedisSerializer<String> serializer = getRedisSerializer();  
	                for (User user : list) {  
	                    byte[] key  = serializer.serialize(user.getId());  
	                    byte[] name = serializer.serialize(user.getName());  
	                    connection.setNX(key, name);  
	                }  
	                return true;  
	            }  
	        }, false, true);  
	        return result;  
	}

	@Override
	public void delete(String key) {
		List<String> list = new ArrayList<String>();  
        list.add(key);  
        delete(list);
		
	}

	@Override
	public void delete(List<String> keys) {
		redisTemplate.delete(keys);  
		
	}

	@Override
	public boolean update(final User user) {
		 String key = user.getId();  
	        if (get(key) == null) {  
	            throw new NullPointerException("数据行不存在, key = " + key);  
	        }  
	        boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {  
	            public Boolean doInRedis(RedisConnection connection)  
	                    throws DataAccessException {  
	                RedisSerializer<String> serializer = getRedisSerializer();  
	                byte[] key  = serializer.serialize(user.getId());  
	                byte[] name = serializer.serialize(user.getName());  
	                connection.set(key, name);  
	                return true;  
	            }  
	        });  
	        return result;  
	}

	@Override
	public User get(final String keyId) {
		 User result = redisTemplate.execute(new RedisCallback<User>() {  
	            public User doInRedis(RedisConnection connection)  
	                    throws DataAccessException {  
	                RedisSerializer<String> serializer = getRedisSerializer();  
	                byte[] key = serializer.serialize(keyId);  
	                byte[] value = connection.get(key);  
	                if (value == null) {  
	                    return null;  
	                }  
	                String name = serializer.deserialize(value);  
	                return new User(keyId, name, null);  
	            }  
	        });  
	        return result; 
	}  
	  
   
}  