package com.water.dao;

import com.water.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    @Insert("insert into books values (null,#{type},#{name},#{description})")
//    @Insert("insert into books(type,name,description) values (#{type},#(name),#{description})")
    public void sava(Book book);

    @Update("update books set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    @Delete("delete from books where id = #{id}")
    public void delete(Integer id);

    @Select("select * from books where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from books")
    public List<Book> getAll();
}
