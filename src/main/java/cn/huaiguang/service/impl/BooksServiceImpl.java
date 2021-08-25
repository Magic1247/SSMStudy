package cn.huaiguang.service.impl;

import cn.huaiguang.mapper.BooksMapper;
import cn.huaiguang.pojo.Books;
import cn.huaiguang.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public void addBooks(Books books) {
        booksMapper.addBooks(books);
    }

    @Override
    public void updateBooks(Books books) {
        booksMapper.updateBooks(books);
    }

    @Override
    public void deleteBooks(List<Integer> ids) {
        booksMapper.deleteBooks(ids);
    }

    @Override
    public List<Books> getBooksById(List<Integer> ids) {
        return booksMapper.getBooksById(ids);
    }

    @Override
    public List<Books> getAll() {
        return booksMapper.getAll();
    }
}
