package me.jiantailang.api.dao;

import java.util.List;

import me.jiantailang.api.entity.Entity;

public interface Dao {

	int create(Entity entity);

	Entity read(int id);

	List<Entity> readAll();

	int edit(Entity entity);

	int delete(int id);
}
