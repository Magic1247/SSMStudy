package cn.huaiguang.mapper;

import cn.huaiguang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {
    // 插入一本书
    void addBooks(Books books);

    // 更新一本书
    void updateBooks(Books books);

    //删除一本书
    void deleteBooks(@Param("bookID") List<Integer> ids);

    // 根据id查询
    List<Books> getBooksById(List<Integer> ids);

    //查询所有
    List<Books> getAll();
}
